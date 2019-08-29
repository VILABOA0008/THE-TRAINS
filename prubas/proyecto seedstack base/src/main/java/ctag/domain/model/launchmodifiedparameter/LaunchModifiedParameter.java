package ctag.domain.model.launchmodifiedparameter;

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
@Table(name = LaunchModifiedParameter.TABLE_NAME)
@IdClass(LaunchModifiedParameterId.class)
public class LaunchModifiedParameter extends BaseAggregateRoot<LaunchModifiedParameterId> {
   
public static final String TABLE_NAME = "LaunchModifiedParameter";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_LAUNCHMODIFIEDPARAMETER = " idLaunchModifiedParameter ";
private static final String FIELD_ID_CONFIGURED_PARAMETER = "Id_Configured_Parameter";
private static final String FIELD_ID_LAUNCH = "Id_Launch";
private static final String FIELD_VALUE = "Value";
private static final String FIELD_BOOLEAN_VALUE = "Boolean_Value";
private static final String FIELD_COMMENT = "Comment";   
public static final String IDCONFIGUREDPARAMETER = "IdConfiguredParameter";   
public static final String IDLAUNCH = "IdLaunch";   
private static final String TABLE_LAUNCHMODIFIEDPARAMETER_PROCESSVIGILANCEWARNING = "WarningModifiedValues";   
private static final String ID_PROCESSVIGILANCEWARNING = "IdWarning";   
private static final String GENERATOR = "LaunchModifiedParameterGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_LAUNCHMODIFIEDPARAMETER, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_ID_CONFIGURED_PARAMETER,unique = false,  nullable = false)
  private Integer idConfiguredParameter;

  @Column(name = FIELD_ID_LAUNCH,unique = false,  nullable = false)
  private Integer idLaunch;

  @Column(name = FIELD_VALUE,unique = false,  nullable = false)
  private float value;

  @Column(name = FIELD_BOOLEAN_VALUE,unique = false,  nullable = false)
  private boolean booleanValue;

  @Column(name = FIELD_COMMENT,unique = false,  nullable = false)
  private String comment;

  LaunchModifiedParameter() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = IDCONFIGUREDPARAMETER, nullable = false, insertable = false, updatable = false)
  private ProcessVigilanceVersionParameter processVigilanceVersionParameter;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = IDCONFIGUREDPARAMETER, nullable = true))
  private ProcessVigilanceVersionParameterId  idProcessVigilanceVersionParameter;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = IDLAUNCH, nullable = false, insertable = false, updatable = false)
  private ProcessLaunch processLaunch;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = IDLAUNCH, nullable = true))
  private ProcessLaunchId  idProcessLaunch;

 
 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinTable(
      name = TABLE_LAUNCHMODIFIEDPARAMETER_PROCESSVIGILANCEWARNING,
      joinColumns = {@JoinColumn(name = ID_LAUNCHMODIFIEDPARAMETER, nullable = false, updatable = false)},
      inverseJoinColumns = {@JoinColumn(name = ID_PROCESSVIGILANCEWARNING, nullable = false, updatable = false)})
  private Set<ProcessVigilanceWarning> processVigilanceWarnings;



  @Override
  public LaunchModifiedParameterId getId() {
    return new LaunchModifiedParameterId(id);
  }

  public Integer getIdConfiguredParameter() {
    return idConfiguredParameter;
  }
  public Integer getIdLaunch() {
    return idLaunch;
  }
  public float getValue() {
    return value;
  }
  public boolean getBooleanValue() {
    return booleanValue;
  }
  public String getComment() {
    return comment;
  }
  public void setIdConfiguredParameter(Integer idConfiguredParameter) {
    this.idConfiguredParameter = idConfiguredParameter;
  }
  public void setIdLaunch(Integer idLaunch) {
    this.idLaunch = idLaunch;
  }
  public void setValue(float value) {
    this.value = value;
  }
  public void setBooleanValue(boolean booleanValue) {
    this.booleanValue = booleanValue;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
   public ProcessVigilanceVersionParameter getProcessVigilanceVersionParameter() {
    return processVigilanceVersionParameter;
  }
  public ProcessVigilanceVersionParameterId getIdProcessVigilanceVersionParameter() {
    return idProcessVigilanceVersionParameter;
  }
  public void setIdProcessVigilanceVersionParameter(ProcessVigilanceVersionParameterId idProcessVigilanceVersionParameter) {
    this.idProcessVigilanceVersionParameter = idProcessVigilanceVersionParameter;
  }
   public ProcessLaunch getProcessLaunch() {
    return processLaunch;
  }
  public ProcessLaunchId getIdProcessLaunch() {
    return idProcessLaunch;
  }
  public void setIdProcessLaunch(ProcessLaunchId idProcessLaunch) {
    this.idProcessLaunch = idProcessLaunch;
  }


}