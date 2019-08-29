package ctag.domain.model.processvigilancewarning;

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
@Table(name = ProcessVigilanceWarning.TABLE_NAME)
@IdClass(ProcessVigilanceWarningId.class)
public class ProcessVigilanceWarning extends BaseAggregateRoot<ProcessVigilanceWarningId> {
   
public static final String TABLE_NAME = "ProcessVigilanceWarning";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PROCESSVIGILANCEWARNING = " idProcessVigilanceWarning ";
private static final String FIELD_VALIDATION = "Validation";   
public static final String FK_VALIDATOR = "FK_Validator";   
public static final String FK_OFFENDINGPARAMETER = "FK_OffendingParameter";   
private static final String MAPPED_BY_LAUNCHMODIFIEDPARAMETER = "processVigilanceWarnings";   
private static final String GENERATOR = "ProcessVigilanceWarningGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PROCESSVIGILANCEWARNING, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_VALIDATION,unique = false,  nullable = false)
  private LocalDateTime validation;

  ProcessVigilanceWarning() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_VALIDATOR, nullable = false, insertable = false, updatable = false)
  private Account account;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_VALIDATOR, nullable = true))
  private AccountId  idAccount;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_OFFENDINGPARAMETER, nullable = false, insertable = false, updatable = false)
  private ProcessVigilanceVersionParameter processVigilanceVersionParameter;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_OFFENDINGPARAMETER, nullable = true))
  private ProcessVigilanceVersionParameterId  idProcessVigilanceVersionParameter;

  
@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy =  MAPPED_BY_LAUNCHMODIFIEDPARAMETER)
  private Set<LaunchModifiedParameter> launchModifiedParameters;



  @Override
  public ProcessVigilanceWarningId getId() {
    return new ProcessVigilanceWarningId(id);
  }

  public LocalDateTime getValidation() {
    return validation;
  }
  public void setValidation(LocalDateTime validation) {
    this.validation = validation;
  }
   public Account getAccount() {
    return account;
  }
  public AccountId getIdAccount() {
    return idAccount;
  }
  public void setIdAccount(AccountId idAccount) {
    this.idAccount = idAccount;
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


}