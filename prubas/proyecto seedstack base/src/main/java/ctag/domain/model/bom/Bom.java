package ctag.domain.model.bom;

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
@Table(name = Bom.TABLE_NAME)
@IdClass(BomId.class)
public class Bom extends BaseAggregateRoot<BomId> {
   
public static final String TABLE_NAME = "Bom";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_BOM = " idBom ";   
public static final String FK_DESIGN = "FK_Design";   
private static final String MAPPED_BY_BOM = "bom";   
private static final String GENERATOR = "BomGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_BOM, nullable = false, unique = true)
  private Integer id;

  Bom() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_DESIGN, nullable = false, insertable = false, updatable = false)
  private Design design;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_DESIGN, nullable = true))
  private DesignId  idDesign;


  @OneToMany(mappedBy = MAPPED_BY_BOM, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Design> designs;

  @OneToMany(mappedBy = MAPPED_BY_BOM, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilance> processVigilances;



  @Override
  public BomId getId() {
    return new BomId(id);
  }

  public Set<Design> getDesigns() {
    if (designs == null) {
      return Collections.<Design>emptySet();
    }
    return Collections.unmodifiableSet(designs);
  }

  public void addDesign(Design design) {
    if (designs == null) {
      this.designs = new HashSet<>();
    }
    this.designs.add(design);
  }
  public Set<ProcessVigilance> getProcessVigilances() {
    if (processVigilances == null) {
      return Collections.<ProcessVigilance>emptySet();
    }
    return Collections.unmodifiableSet(processVigilances);
  }

  public void addProcessVigilance(ProcessVigilance processVigilance) {
    if (processVigilances == null) {
      this.processVigilances = new HashSet<>();
    }
    this.processVigilances.add(processVigilance);
  }
   public Design getDesign() {
    return design;
  }
  public DesignId getIdDesign() {
    return idDesign;
  }
  public void setIdDesign(DesignId idDesign) {
    this.idDesign = idDesign;
  }


}