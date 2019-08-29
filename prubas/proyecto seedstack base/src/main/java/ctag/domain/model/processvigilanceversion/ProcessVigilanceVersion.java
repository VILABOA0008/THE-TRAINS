package ctag.domain.model.processvigilanceversion;

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
@Table(name = ProcessVigilanceVersion.TABLE_NAME)
@IdClass(ProcessVigilanceVersionId.class)
public class ProcessVigilanceVersion extends BaseAggregateRoot<ProcessVigilanceVersionId> {
   
public static final String TABLE_NAME = "ProcessVigilanceVersion";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PROCESSVIGILANCEVERSION = " idProcessVigilanceVersion ";
private static final String FIELD_REVISION = "Revision";
private static final String FIELD_CREATOR = "Creator";
private static final String FIELD_LAST_MODIFIER = "Last_Modifier";
private static final String FIELD_STATE = "State";
private static final String FIELD_ACTIVATION = "Activation";
private static final String FIELD_DEACTIVATION = "Deactivation";   
public static final String FK_PROCESSVIGILANCE = "FK_ProcessVigilance";   
public static final String CREATOR = "Creator";   
public static final String LASTMODIFIER = "LastModifier";   
private static final String MAPPED_BY_PROCESS_VIGILANCE_VERSION = "processVigilanceVersion";   
private static final String GENERATOR = "ProcessVigilanceVersionGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PROCESSVIGILANCEVERSION, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_REVISION,unique = false,  nullable = false)
  private Integer revision;

  @Column(name = FIELD_CREATOR,unique = false,  nullable = false)
  private Integer creator;

  @Column(name = FIELD_LAST_MODIFIER,unique = false,  nullable = false)
  private Integer lastModifier;

  @Column(name = FIELD_STATE,unique = false,  nullable = false)
  private Integer state;

  @Column(name = FIELD_ACTIVATION,unique = false,  nullable = false)
  private LocalDateTime activation;

  @Column(name = FIELD_DEACTIVATION,unique = false,  nullable = false)
  private LocalDateTime deactivation;

  ProcessVigilanceVersion() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PROCESSVIGILANCE, nullable = false, insertable = false, updatable = false)
  private ProcessVigilance processVigilance;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_PROCESSVIGILANCE, nullable = true))
  private ProcessVigilanceId  idProcessVigilance;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = CREATOR, nullable = false, insertable = false, updatable = false)
  private Account account;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = CREATOR, nullable = true))
  private AccountId  idAccount;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = LASTMODIFIER, nullable = false, insertable = false, updatable = false)
  private Account account;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = LASTMODIFIER, nullable = true))
  private AccountId  idAccount;


  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilance> processVigilances;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Account> accounts;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Account> accounts;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceVersionParameter> processVigilanceVersionParameters;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE_VERSION, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessLaunch> processLaunchs;



  @Override
  public ProcessVigilanceVersionId getId() {
    return new ProcessVigilanceVersionId(id);
  }

  public Integer getRevision() {
    return revision;
  }
  public Integer getCreator() {
    return creator;
  }
  public Integer getLastModifier() {
    return lastModifier;
  }
  public Integer getState() {
    return state;
  }
  public LocalDateTime getActivation() {
    return activation;
  }
  public LocalDateTime getDeactivation() {
    return deactivation;
  }
  public void setRevision(Integer revision) {
    this.revision = revision;
  }
  public void setCreator(Integer creator) {
    this.creator = creator;
  }
  public void setLastModifier(Integer lastModifier) {
    this.lastModifier = lastModifier;
  }
  public void setState(Integer state) {
    this.state = state;
  }
  public void setActivation(LocalDateTime activation) {
    this.activation = activation;
  }
  public void setDeactivation(LocalDateTime deactivation) {
    this.deactivation = deactivation;
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
  public Set<Account> getAccounts() {
    if (accounts == null) {
      return Collections.<Account>emptySet();
    }
    return Collections.unmodifiableSet(accounts);
  }

  public void addAccount(Account account) {
    if (accounts == null) {
      this.accounts = new HashSet<>();
    }
    this.accounts.add(account);
  }
  public Set<Account> getAccounts() {
    if (accounts == null) {
      return Collections.<Account>emptySet();
    }
    return Collections.unmodifiableSet(accounts);
  }

  public void addAccount(Account account) {
    if (accounts == null) {
      this.accounts = new HashSet<>();
    }
    this.accounts.add(account);
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
   public ProcessVigilance getProcessVigilance() {
    return processVigilance;
  }
  public ProcessVigilanceId getIdProcessVigilance() {
    return idProcessVigilance;
  }
  public void setIdProcessVigilance(ProcessVigilanceId idProcessVigilance) {
    this.idProcessVigilance = idProcessVigilance;
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
   public Account getAccount() {
    return account;
  }
  public AccountId getIdAccount() {
    return idAccount;
  }
  public void setIdAccount(AccountId idAccount) {
    this.idAccount = idAccount;
  }


}