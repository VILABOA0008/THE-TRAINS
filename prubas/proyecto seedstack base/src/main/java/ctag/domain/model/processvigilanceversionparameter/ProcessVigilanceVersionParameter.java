package ctag.domain.model.processvigilanceversionparameter;

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
@Table(name = ProcessVigilanceVersionParameter.TABLE_NAME)
@IdClass(ProcessVigilanceVersionParameterId.class)
public class ProcessVigilanceVersionParameter extends BaseAggregateRoot<ProcessVigilanceVersionParameterId> {
   
public static final String TABLE_NAME = "ProcessVigilanceVersionParameter";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PROCESSVIGILANCEVERSIONPARAMETER = " idProcessVigilanceVersionParameter ";
private static final String FIELD_ID_PROCESS_VIGILANCE_VERSION = "Id_Process_Vigilance_Version";
private static final String FIELD_ID_PARAMETER = "Id_Parameter";
private static final String FIELD_POINT = "Point";
private static final String FIELD_NOMINAL = "Nominal";
private static final String FIELD_BOOLEAN_NOMINAL = "Boolean_Nominal";   
public static final String IDPROCESSVIGILANCEVERSION = "IdProcessVigilanceVersion";   
public static final String IDPARAMETER = "IdParameter";   
private static final String MAPPED_BY_PROCESS_VIGILANCE_VERSION_PARAMETER = "processVigilanceVersionParameter";   
private static final String GENERATOR = "ProcessVigilanceVersionParameterGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PROCESSVIGILANCEVERSIONPARAMETER, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_ID_PROCESS_VIGILANCE_VERSION,unique = false,  nullable = false)
  private Integer idProcessVigilanceVersion;

  @Column(name = FIELD_ID_PARAMETER,unique = false,  nullable = false)
  private Integer idParameter;

  @Column(name = FIELD_POINT,unique = false,  nullable = false)
  private Integer point;

  @Column(name = FIELD_NOMINAL,unique = false,  nullable = false)
  private float nominal;

  @Column(name = FIELD_BOOLEAN_NOMINAL,unique = false,  nullable = false)
  private boolean booleanNominal;

  ProcessVigilanceVersionParameter() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = IDPROCESSVIGILANCEVERSION, nullable = false, insertable = false, updatable = false)
  private ProcessVigilanceVersion processVigilanceVersion;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = IDPROCESSVIGILANCEVERSION, nullable = true))
  private ProcessVigilanceVersionId  idProcessVigilanceVersion;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = IDPARAMETER, nullable = false, insertable = false, updatable = false)
  private Parameter parameter;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = IDPARAMETER, nullable = true))
  private ParameterId  idParameter;


  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION_PARAMETER, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceVersion> processVigilanceVersions;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION_PARAMETER, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Parameter> parameters;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION_PARAMETER, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<LaunchModifiedParameter> launchModifiedParameters;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION_PARAMETER, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceWarning> processVigilanceWarnings;



  @Override
  public ProcessVigilanceVersionParameterId getId() {
    return new ProcessVigilanceVersionParameterId(id);
  }

  public Integer getIdProcessVigilanceVersion() {
    return idProcessVigilanceVersion;
  }
  public Integer getIdParameter() {
    return idParameter;
  }
  public Integer getPoint() {
    return point;
  }
  public float getNominal() {
    return nominal;
  }
  public boolean getBooleanNominal() {
    return booleanNominal;
  }
  public void setIdProcessVigilanceVersion(Integer idProcessVigilanceVersion) {
    this.idProcessVigilanceVersion = idProcessVigilanceVersion;
  }
  public void setIdParameter(Integer idParameter) {
    this.idParameter = idParameter;
  }
  public void setPoint(Integer point) {
    this.point = point;
  }
  public void setNominal(float nominal) {
    this.nominal = nominal;
  }
  public void setBooleanNominal(boolean booleanNominal) {
    this.booleanNominal = booleanNominal;
  }
  public Set<ProcessVigilanceVersion> getProcessVigilanceVersions() {
    if (processVigilanceVersions == null) {
      return Collections.<ProcessVigilanceVersion>emptySet();
    }
    return Collections.unmodifiableSet(processVigilanceVersions);
  }

  public void addProcessVigilanceVersion(ProcessVigilanceVersion processVigilanceVersion) {
    if (processVigilanceVersions == null) {
      this.processVigilanceVersions = new HashSet<>();
    }
    this.processVigilanceVersions.add(processVigilanceVersion);
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
  public Set<LaunchModifiedParameter> getLaunchModifiedParameters() {
    if (launchModifiedParameters == null) {
      return Collections.<LaunchModifiedParameter>emptySet();
    }
    return Collections.unmodifiableSet(launchModifiedParameters);
  }

  public void addLaunchModifiedParameter(LaunchModifiedParameter launchModifiedParameter) {
    if (launchModifiedParameters == null) {
      this.launchModifiedParameters = new HashSet<>();
    }
    this.launchModifiedParameters.add(launchModifiedParameter);
  }
  public Set<ProcessVigilanceWarning> getProcessVigilanceWarnings() {
    if (processVigilanceWarnings == null) {
      return Collections.<ProcessVigilanceWarning>emptySet();
    }
    return Collections.unmodifiableSet(processVigilanceWarnings);
  }

  public void addProcessVigilanceWarning(ProcessVigilanceWarning processVigilanceWarning) {
    if (processVigilanceWarnings == null) {
      this.processVigilanceWarnings = new HashSet<>();
    }
    this.processVigilanceWarnings.add(processVigilanceWarning);
  }
   public ProcessVigilanceVersion getProcessVigilanceVersion() {
    return processVigilanceVersion;
  }
  public ProcessVigilanceVersionId getIdProcessVigilanceVersion() {
    return idProcessVigilanceVersion;
  }
  public void setIdProcessVigilanceVersion(ProcessVigilanceVersionId idProcessVigilanceVersion) {
    this.idProcessVigilanceVersion = idProcessVigilanceVersion;
  }
   public Parameter getParameter() {
    return parameter;
  }
  public ParameterId getIdParameter() {
    return idParameter;
  }
  public void setIdParameter(ParameterId idParameter) {
    this.idParameter = idParameter;
  }


}