package ctag.domain.model.tot_button;

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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.seedstack.business.domain.BaseAggregateRoot;

@Entity
@Table(name = Tot_button.TABLE_NAME)
@IdClass(Tot_buttonId.class)
public class Tot_button extends BaseAggregateRoot<Tot_buttonId> {

  public static final String TABLE_NAME = "TOT_Button";
  private static final String ID = "id";
  private static final String KEY_VAL = "KeyVal";
  private static final String SEQUENCE = "SEQUENCE";
  private static final String VALUE = "Value";
  private static final String ID_TOT_BUTTON = " idTot_button ";
  private static final String FIELD_PAGE = "Page";
  private static final String FIELD_SHORT_NAME = "Short_Name";
  private static final String FIELD_ORDER = "Order";
  private static final String FIELD_NAME = "Name";
  private static final String FIELD_X = "X";
  private static final String FIELD_Y = "Y";
  private static final String FIELD_W = "W";
  private static final String FIELD_H = "H";
  private static final String FIELD_ACTIVE = "Active";
  public static final String FK_PAGE = "FK_Page";
  private static final String MAPPED_BY_TOT_DOCUMENT = "tot_buttons";
  private static final String MAPPED_BY_TOT_STYLE = "tot_buttons";
  private static final String GENERATOR = "Tot_buttonGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_TOT_BUTTON, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_PAGE, unique = false, nullable = false)
  private Integer page;

  @Column(name = FIELD_SHORT_NAME, unique = false, nullable = false)
  private String shortName;

  @Column(name = FIELD_ORDER, unique = false, nullable = false)
  private Integer order;

  @Column(name = FIELD_NAME, unique = false, nullable = false)
  private String name;

  @Column(name = FIELD_X, unique = false, nullable = false)
  private Integer x;

  @Column(name = FIELD_Y, unique = false, nullable = false)
  private Integer y;

  @Column(name = FIELD_W, unique = false, nullable = false)
  private Integer w;

  @Column(name = FIELD_H, unique = false, nullable = false)
  private Integer h;

  @Column(name = FIELD_ACTIVE, unique = false, nullable = false)
  private boolean active;

  Tot_button() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PAGE, nullable = false, insertable = false, updatable = false)
  private TOT_Page tOT_Page;

  @EmbeddedId
  @AttributeOverride(name = ID, column = @Column(name = FK_PAGE, nullable = true))
  private TOT_PageId idTOT_Page;

  @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = MAPPED_BY_TOT_DOCUMENT)
  private Set<TOT_Document> tOT_Documents;

  @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = MAPPED_BY_TOT_STYLE)
  private Set<TOT_Style> tOT_Styles;

  @Override
  public Tot_buttonId getId() {
    return new Tot_buttonId(id);
  }

  public Integer getPage() {
    return page;
  }

  public String getShortName() {
    return shortName;
  }

  public Integer getOrder() {
    return order;
  }

  public String getName() {
    return name;
  }

  public Integer getX() {
    return x;
  }

  public Integer getY() {
    return y;
  }

  public Integer getW() {
    return w;
  }

  public Integer getH() {
    return h;
  }

  public boolean getActive() {
    return active;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public TOT_Page getTOT_Page() {
    return tOT_Page;
  }

  public TOT_PageId getIdTOT_Page() {
    return idTOT_Page;
  }

  public void setIdTOT_Page(TOT_PageId idTOT_Page) {
    this.idTOT_Page = idTOT_Page;
  }

}
