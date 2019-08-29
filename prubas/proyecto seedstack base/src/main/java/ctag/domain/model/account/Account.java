package ctag.domain.model.account;

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
@Table(name = Account.TABLE_NAME)
@IdClass(AccountId.class)
public class Account extends BaseAggregateRoot<AccountId> {
   
public static final String TABLE_NAME = "Account";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_ACCOUNT = " idAccount ";
private static final String FIELD_NAME = "Name";   
private static final String MAPPED_BY_ACCOUNT = "account";   
private static final String GENERATOR = "AccountGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_ACCOUNT, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  Account() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_ACCOUNT, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceWarning> processVigilanceWarnings;



  @Override
  public AccountId getId() {
    return new AccountId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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


}