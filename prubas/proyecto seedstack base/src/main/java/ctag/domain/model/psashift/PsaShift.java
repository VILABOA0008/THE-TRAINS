package ctag.domain.model.psashift;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import org.seedstack.business.domain.BaseAggregateRoot;

@Entity
@Table(name = PsaShift.TABLE_NAME)
@IdClass(PsaShiftId.class)
public class PsaShift extends BaseAggregateRoot<PsaShiftId> {
   
public static final String TABLE_NAME = "PsaShift";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PSASHIFT = " idPsaShift ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_ACTIVE = "Active";   
private static final String MAPPED_BY_PSA_SHIFT = "psaShift";   
private static final String GENERATOR = "PsaShiftGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PSASHIFT, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_ACTIVE,unique = false,  nullable = false)
  private boolean active;

  PsaShift() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_PSA_SHIFT, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessLaunch> processLaunchs;



  @Override
  public PsaShiftId getId() {
    return new PsaShiftId(id);
  }

  public String getName() {
    return name;
  }
  public boolean getActive() {
    return active;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setActive(boolean active) {
    this.active = active;
  }
  public Set<ProcessLaunch> getProcessLaunchs() {
    if (processLaunchs == null) {
      return Collections.<ProcessLaunch>emptySet();
    }
    return Collections.unmodifiableSet(processLaunchs);
  }

  public void addProcessLaunch(ProcessLaunch processLaunch) {
    if (processLaunchs == null) {
      this.processLaunchs = new HashSet<>();
    }
    this.processLaunchs.add(processLaunch);
  }


}