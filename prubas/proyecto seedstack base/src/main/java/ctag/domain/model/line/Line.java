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
private static final String FIELD_PLANT = "Plant";
private static final String FIELD_GROUP = "Group";   
public static final String FK_LINETYPE = "FK_LineType";   
private static final String MAPPED_BY_LINE = "line";   
private static final String MAPPED_BY_DESIGN = "lines";   
private static final String GENERATOR = "LineGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_LINE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_PLANT,unique = false,  nullable = false)
  private Integer plant;

  @Column(name = FIELD_GROUP,unique = false,  nullable = false)
  private Integer group;

  Line() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_LINETYPE, nullable = false, insertable = false, updatable = false)
  private LineType lineType;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_LINETYPE, nullable = true))
  private LineTypeId  idLineType;


  @OneToMany(mappedBy = MAPPED_BY_LINE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<LineBOMS> lineBOMSs;
  
@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy =  MAPPED_BY_DESIGN)
  private Set<Design> designs;



  @Override
  public LineId getId() {
    return new LineId(id);
  }

  public String getName() {
    return name;
  }
  public Integer getPlant() {
    return plant;
  }
  public Integer getGroup() {
    return group;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setPlant(Integer plant) {
    this.plant = plant;
  }
  public void setGroup(Integer group) {
    this.group = group;
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
    return idLineType;
  }
  public void setIdLineType(LineTypeId idLineType) {
    this.idLineType = idLineType;
  }


}