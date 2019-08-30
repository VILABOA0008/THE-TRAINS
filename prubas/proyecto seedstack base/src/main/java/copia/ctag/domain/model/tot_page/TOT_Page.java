package ctag.domain.model.tot_page;

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
@Table(name = TOT_Page.TABLE_NAME)
@IdClass(TOT_PageId.class)
public class TOT_Page extends BaseAggregateRoot<TOT_PageId> {
   
public static final String TABLE_NAME = "TOT_Page";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_TOT_PAGE = " idTOT_Page ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_ORDER = "Order";
private static final String FIELD_ACTIVE = "Active";   
public static final String FK_LINE = "FK_Line";   
private static final String MAPPED_BY_T_O_T___PAGE = "tOT_Page";   
private static final String GENERATOR = "TOT_PageGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_TOT_PAGE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_ORDER,unique = false,  nullable = false)
  private Integer order;

  @Column(name = FIELD_ACTIVE,unique = false,  nullable = false)
  private boolean active;

  TOT_Page() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_LINE, nullable = false, insertable = false, updatable = false)
  private Line line;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_LINE, nullable = true))
  private LineId  idLine;


  @OneToMany(mappedBy = MAPPED_BY_T_O_T___PAGE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Line> lines;

  @OneToMany(mappedBy = MAPPED_BY_T_O_T___PAGE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<TOT_Button> tOT_Buttons;



  @Override
  public TOT_PageId getId() {
    return new TOT_PageId(id);
  }

  public String getName() {
    return name;
  }
  public Integer getOrder() {
    return order;
  }
  public boolean getActive() {
    return active;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }
  public void setActive(boolean active) {
    this.active = active;
  }
  public Set<Line> getLines() {
    if (lines == null) {
      return Collections.<Line>emptySet();
    }
    return Collections.unmodifiableSet(lines);
  }

  public void addLine(Line line) {
    if (lines == null) {
      this.lines = new HashSet<>();
    }
    this.lines.add(line);
  }
  public Set<TOT_Button> getTOT_Buttons() {
    if (tOT_Buttons == null) {
      return Collections.<TOT_Button>emptySet();
    }
    return Collections.unmodifiableSet(tOT_Buttons);
  }

  public void addTOT_Button(TOT_Button tOT_Button) {
    if (tOT_Buttons == null) {
      this.tOT_Buttons = new HashSet<>();
    }
    this.tOT_Buttons.add(tOT_Button);
  }
   public Line getLine() {
    return line;
  }
  public LineId getIdLine() {
    return idLine;
  }
  public void setIdLine(LineId idLine) {
    this.idLine = idLine;
  }


}