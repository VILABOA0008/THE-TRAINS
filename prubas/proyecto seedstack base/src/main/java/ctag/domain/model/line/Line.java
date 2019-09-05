package ctag.domain.model.line;

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
@Table(name = Line.TABLE_NAME)
@IdClass(LineId.class)
public class Line extends BaseAggregateRoot<LineId> {
   
public static final String TABLE_NAME = "Line";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_LINE = " idLine ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_F_K_PLANT = "FK_Plant";
private static final String FIELD_F_K_GROUP = "FK_Group";   
public static final String FK_LINETYPE = "FK_LineType";   
private static final String MAPPED_BY_LINE = "line";   
private static final String GENERATOR = "LineGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_LINE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_F_K_PLANT,unique = false,  nullable = false)
  private Integer fK_Plant;

  @Column(name = FIELD_F_K_GROUP,unique = false,  nullable = false)
  private Integer fK_Group;

  Line() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_LINETYPE, nullable = false, insertable = false, updatable = false)
  private LineType lineType;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_LINETYPE, nullable = true))
  private LineTypeId  lineTypeId;


  @OneToMany(mappedBy = MAPPED_BY_LINE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<LineBOMS> lineBOMSs;



  @Override
  public LineId getId() {
    return new LineId(id);
  }

  public String getName() {
    return name;
  }
  public Integer getFK_Plant() {
    return fK_Plant;
  }
  public Integer getFK_Group() {
    return fK_Group;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setFK_Plant(Integer fK_Plant) {
    this.fK_Plant = fK_Plant;
  }
  public void setFK_Group(Integer fK_Group) {
    this.fK_Group = fK_Group;
  }
  public Set<LineBOMS> getLineBOMSs() {
    if (lineBOMSs == null) {
      return Collections.<LineBOMS>emptySet();
    }
    return Collections.unmodifiableSet(lineBOMSs);
  }

  public void addLineBOMS(LineBOMS lineBOMS) {
    if (lineBOMSs == null) {
      this.lineBOMSs = new HashSet<>();
    }
    this.lineBOMSs.add(lineBOMS);
  }
   public LineType getLineType() {
    return lineType;
  }
  public LineTypeId getIdLineType() {
    return lineTypeId;
  }
  public void setIdLineType(LineTypeId lineTypeId) {
    this.lineTypeId = lineTypeId;
  }


}