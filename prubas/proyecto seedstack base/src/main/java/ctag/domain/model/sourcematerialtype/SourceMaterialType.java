package ctag.domain.model.sourcematerialtype;

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
@Table(name = SourceMaterialType.TABLE_NAME)
@IdClass(SourceMaterialTypeId.class)
public class SourceMaterialType extends BaseAggregateRoot<SourceMaterialTypeId> {
   
public static final String TABLE_NAME = "SourceMaterialType";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_SOURCEMATERIALTYPE = " idSourceMaterialType ";
private static final String FIELD_NAME = "Name";   
private static final String MAPPED_BY_SOURCE_MATERIAL_TYPE = "sourceMaterialType";   
private static final String GENERATOR = "SourceMaterialTypeGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_SOURCEMATERIALTYPE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  SourceMaterialType() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_SOURCE_MATERIAL_TYPE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilance> processVigilances;



  @Override
  public SourceMaterialTypeId getId() {
    return new SourceMaterialTypeId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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


}