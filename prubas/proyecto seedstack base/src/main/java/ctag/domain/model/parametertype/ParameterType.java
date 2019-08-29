package ctag.domain.model.parametertype;

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
@Table(name = ParameterType.TABLE_NAME)
@IdClass(ParameterTypeId.class)
public class ParameterType extends BaseAggregateRoot<ParameterTypeId> {
   
public static final String TABLE_NAME = "ParameterType";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PARAMETERTYPE = " idParameterType ";
private static final String FIELD_NAME = "Name";   
private static final String MAPPED_BY_PARAMETER_TYPE = "parameterType";   
private static final String GENERATOR = "ParameterTypeGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PARAMETERTYPE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  ParameterType() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_PARAMETER_TYPE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Parameter> parameters;



  @Override
  public ParameterTypeId getId() {
    return new ParameterTypeId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Set<Parameter> getParameters() {
    if (parameters == null) {
      return Collections.<Parameter>emptySet();
    }
    return Collections.unmodifiableSet(parameters);
  }

  public void addParameter(Parameter parameter) {
    if (parameters == null) {
      this.parameters = new HashSet<>();
    }
    this.parameters.add(parameter);
  }


}