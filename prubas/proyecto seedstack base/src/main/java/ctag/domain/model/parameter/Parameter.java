package ctag.domain.model.parameter;

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
@Table(name = Parameter.TABLE_NAME)
@IdClass(ParameterId.class)
public class Parameter extends BaseAggregateRoot<ParameterId> {
   
public static final String TABLE_NAME = "Parameter";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PARAMETER = " idParameter ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_HAS_POINTS = "Has_Points";   
public static final String FK_PARAMETERTYPE = "FK_ParameterType";   
private static final String MAPPED_BY_PARAMETER = "parameter";   
private static final String GENERATOR = "ParameterGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PARAMETER, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_HAS_POINTS,unique = false,  nullable = false)
  private boolean hasPoints;

  Parameter() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PARAMETERTYPE, nullable = false, insertable = false, updatable = false)
  private ParameterType parameterType;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_PARAMETERTYPE, nullable = true))
  private ParameterTypeId  idParameterType;


  @OneToMany(mappedBy = MAPPED_BY_PARAMETER, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ParameterType> parameterTypes;

  @OneToMany(mappedBy = MAPPED_BY_PARAMETER, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<LineTypeParameter> lineTypeParameters;

  @OneToMany(mappedBy = MAPPED_BY_PARAMETER, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceVersionParameter> processVigilanceVersionParameters;



  @Override
  public ParameterId getId() {
    return new ParameterId(id);
  }

  public String getName() {
    return name;
  }
  public boolean getHasPoints() {
    return hasPoints;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setHasPoints(boolean hasPoints) {
    this.hasPoints = hasPoints;
  }
  public Set<ParameterType> getParameterTypes() {
    if (parameterTypes == null) {
      return Collections.<ParameterType>emptySet();
    }
    return Collections.unmodifiableSet(parameterTypes);
  }

  public void addParameterType(ParameterType parameterType) {
    if (parameterTypes == null) {
      this.parameterTypes = new HashSet<>();
    }
    this.parameterTypes.add(parameterType);
  }
  public Set<LineTypeParameter> getLineTypeParameters() {
    if (lineTypeParameters == null) {
      return Collections.<LineTypeParameter>emptySet();
    }
    return Collections.unmodifiableSet(lineTypeParameters);
  }

  public void addLineTypeParameter(LineTypeParameter lineTypeParameter) {
    if (lineTypeParameters == null) {
      this.lineTypeParameters = new HashSet<>();
    }
    this.lineTypeParameters.add(lineTypeParameter);
  }
  public Set<ProcessVigilanceVersionParameter> getProcessVigilanceVersionParameters() {
    if (processVigilanceVersionParameters == null) {
      return Collections.<ProcessVigilanceVersionParameter>emptySet();
    }
    return Collections.unmodifiableSet(processVigilanceVersionParameters);
  }

  public void addProcessVigilanceVersionParameter(ProcessVigilanceVersionParameter processVigilanceVersionParameter) {
    if (processVigilanceVersionParameters == null) {
      this.processVigilanceVersionParameters = new HashSet<>();
    }
    this.processVigilanceVersionParameters.add(processVigilanceVersionParameter);
  }
   public ParameterType getParameterType() {
    return parameterType;
  }
  public ParameterTypeId getIdParameterType() {
    return idParameterType;
  }
  public void setIdParameterType(ParameterTypeId idParameterType) {
    this.idParameterType = idParameterType;
  }


}