package ctag.domain.model.processlaunch;

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
@Table(name = ProcessLaunch.TABLE_NAME)
@IdClass(ProcessLaunchId.class)
public class ProcessLaunch extends BaseAggregateRoot<ProcessLaunchId> {
   
public static final String TABLE_NAME = "ProcessLaunch";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PROCESSLAUNCH = " idProcessLaunch ";
private static final String FIELD_STAMPS = "Stamps";
private static final String FIELD_LAUNCH_TIME = "Launch_Time";
private static final String FIELD_MODIFIES_PARAMETER = "Modifies_Parameter";   
public static final String FK_PSASHIFT = "FK_PsaShift";   
public static final String FK_PROCESSVIGILANCEVERSION = "FK_ProcessVigilanceVersion";   
public static final String FK_CREATOR = "FK_Creator";   
private static final String MAPPED_BY_PROCESS_LAUNCH = "processLaunch";   
private static final String GENERATOR = "ProcessLaunchGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PROCESSLAUNCH, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_STAMPS,unique = false,  nullable = false)
  private Integer stamps;

  @Column(name = FIELD_LAUNCH_TIME,unique = false,  nullable = false)
  private LocalDateTime launchTime;

  @Column(name = FIELD_MODIFIES_PARAMETER,unique = false,  nullable = false)
  private boolean modifiesParameter;

  ProcessLaunch() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PSASHIFT, nullable = false, insertable = false, updatable = false)
  private PsaShift psaShift;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_PSASHIFT, nullable = true))
  private PsaShiftId  idPsaShift;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PROCESSVIGILANCEVERSION, nullable = false, insertable = false, updatable = false)
  private ProcessVigilanceVersion processVigilanceVersion;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_PROCESSVIGILANCEVERSION, nullable = true))
  private ProcessVigilanceVersionId  idProcessVigilanceVersion;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_CREATOR, nullable = false, insertable = false, updatable = false)
  private Account account;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_CREATOR, nullable = true))
  private AccountId  idAccount;


  @OneToMany(mappedBy = MAPPED_BY_PROCESS_LAUNCH, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<PsaShift> psaShifts;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_LAUNCH, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceVersion> processVigilanceVersions;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_LAUNCH, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Account> accounts;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_LAUNCH, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<CoilLaunch> coilLaunchs;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_LAUNCH, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<LaunchModifiedParameter> launchModifiedParameters;



  @Override
  public ProcessLaunchId getId() {
    return new ProcessLaunchId(id);
  }

  public Integer getStamps() {
    return stamps;
  }
  public LocalDateTime getLaunchTime() {
    return launchTime;
  }
  public boolean getModifiesParameter() {
    return modifiesParameter;
  }
  public void setStamps(Integer stamps) {
    this.stamps = stamps;
  }
  public void setLaunchTime(LocalDateTime launchTime) {
    this.launchTime = launchTime;
  }
  public void setModifiesParameter(boolean modifiesParameter) {
    this.modifiesParameter = modifiesParameter;
  }
  public Set<PsaShift> getPsaShifts() {
    if (psaShifts == null) {
      return Collections.<PsaShift>emptySet();
    }
    return Collections.unmodifiableSet(psaShifts);
  }

  public void addPsaShift(PsaShift psaShift) {
    if (psaShifts == null) {
      this.psaShifts = new HashSet<>();
    }
    this.psaShifts.add(psaShift);
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
  public Set<CoilLaunch> getCoilLaunchs() {
    if (coilLaunchs == null) {
      return Collections.<CoilLaunch>emptySet();
    }
    return Collections.unmodifiableSet(coilLaunchs);
  }

  public void addCoilLaunch(CoilLaunch coilLaunch) {
    if (coilLaunchs == null) {
      this.coilLaunchs = new HashSet<>();
    }
    this.coilLaunchs.add(coilLaunch);
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
   public PsaShift getPsaShift() {
    return psaShift;
  }
  public PsaShiftId getIdPsaShift() {
    return idPsaShift;
  }
  public void setIdPsaShift(PsaShiftId idPsaShift) {
    this.idPsaShift = idPsaShift;
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