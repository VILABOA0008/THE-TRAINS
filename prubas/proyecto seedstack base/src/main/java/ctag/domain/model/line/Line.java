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
  private Set<LineType> lineTypes;

  @OneToMany(mappedBy = MAPPED_BY_LINE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ReworkBatch> reworkBatchs;

  @OneToMany(mappedBy = MAPPED_BY_LINE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilance> processVigilances;



  @Override
  public LineId getId() {
    return new LineId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Set<LineType> getLineTypes() {
    if (lineTypes == null) {
      return Collections.<LineType>emptySet();
    }
    return Collections.unmodifiableSet(lineTypes);
  }

  public void addLineType(LineType lineType) {
    if (lineTypes == null) {
      this.lineTypes = new HashSet<>();
    }
    this.lineTypes.add(lineType);
  }
  public Set<ReworkBatch> getReworkBatchs() {
    if (reworkBatchs == null) {
      return Collections.<ReworkBatch>emptySet();
    }
    return Collections.unmodifiableSet(reworkBatchs);
  }

  public void addReworkBatch(ReworkBatch reworkBatch) {
    if (reworkBatchs == null) {
      this.reworkBatchs = new HashSet<>();
    }
    this.reworkBatchs.add(reworkBatch);
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