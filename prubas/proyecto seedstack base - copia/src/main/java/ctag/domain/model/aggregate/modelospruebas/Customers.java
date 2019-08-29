package ctag.domain.model.aggregate.modelospruebas;

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
@Table(name = Customers.TABLE_NAME)
@IdClass(CustomersId.class)
public class Customers extends BaseAggregateRoot<CustomersId> {
   
private static final String TABLE_NAME = "CUSTOMERS";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_CUSTOMERS = " idCustomers ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_USERNAME = "Username";
private static final String FIELD_AGE = "Age";   
private static final String FK_STYLE = "Style";   
private static final String FK_PAGE = "Page";   
private static final String MAPPED_BY_STORAGE = "storage";   
private static final String TABLE_CUSTOMERS_PAGE = "TOT_CUSTOMER_PAGE";   
private static final String ID_PAGE = "idPage";   
private static final String MAPPED_BY_STYLE = "customers";   
private static final String GENERATOR = "CustomersGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
 
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_CUSTOMERS, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_USERNAME,unique = false,  nullable = false)
  private String username;

  @Column(name = FIELD_AGE,unique = false,  nullable = false)
  private Integer age;

  Customers() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_STYLE, nullable = false, insertable = false, updatable = false)
  private Style style;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_STYLE, nullable = true))
  private StyleId  idStyle;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PAGE, nullable = false, insertable = false, updatable = false)
  private Page page;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_PAGE, nullable = true))
  private PageId  idPage;


  @OneToMany(mappedBy = MAPPED_BY_STORAGE, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Set<Position> positions;
 
 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinTable(
      name = TABLE_CUSTOMERS_PAGE,
      joinColumns = {@JoinColumn(name = ID_CUSTOMERS, nullable = false, updatable = false)},
      inverseJoinColumns = {@JoinColumn(name = ID_PAGE, nullable = false, updatable = false)})
  private Set<Page> pages;
  @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy =  MAPPED_BY_STYLE)
  private Set<Style> styles;


  @Override
  public CustomersId getId() {
    return new CustomersId(id);
  }

  public String getName() {
    return name;
  }
  public String getUsername() {
    return username;
  }
  public Integer getAge() {
    return age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public Set<Position> getPositions() {
    if (positions == null) {
      return Collections.<Position>emptySet();
    }
    return Collections.unmodifiableSet(positions);
  }

  public void addPosition(Position position) {
    if (positions == null) {
      this.positions = new HashSet<>();
    }
    this.positions.add(position);
  }
  public StyleId getIdStyle() {
    return idStyle;
  }
  public void setIdStyle(StyleId idStyle) {
    this.idStyle = idStyle;
  }
  public PageId getIdPage() {
    return idPage;
  }
  public void setIdPage(PageId idPage) {
    this.idPage = idPage;
  }


}