package ctag.domain.model.part;

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
@Table(name = Part.TABLE_NAME)
@IdClass(PartId.class)
public class Part extends BaseAggregateRoot<PartId> {
   
public static final String TABLE_NAME = "Part";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PART = " idPart ";
private static final String FIELD_NAME = "Name";   
public static final String FK_DESIGN = "FK_Design";   
public static final String FK_STATE = "FK_State";   
private static final String MAPPED_BY_PART = "part";   
private static final String GENERATOR = "PartGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PART, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  Part() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_DESIGN, nullable = false, insertable = false, updatable = false)
  private Design design;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_DESIGN, nullable = true))
  private DesignId  idDesign;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_STATE, nullable = false, insertable = false, updatable = false)
  private PartState partState;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_STATE, nullable = true))
  private PartStateId  idPartState;


  @OneToMany(mappedBy = MAPPED_BY_PART, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Design> designs;

  @OneToMany(mappedBy = MAPPED_BY_PART, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<PartState> partStates;

  @OneToMany(mappedBy = MAPPED_BY_PART, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ReworkBatch> reworkBatchs;



  @Override
  public PartId getId() {
    return new PartId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Set<Design> getDesigns() {
    if (designs == null) {
      return Collections.<Design>emptySet();
    }
    return Collections.unmodifiableSet(designs);
  }

  public void addDesign(Design design) {
    if (designs == null) {
      this.designs = new HashSet<>();
    }
    this.designs.add(design);
  }
  public Set<PartState> getPartStates() {
    if (partStates == null) {
      return Collections.<PartState>emptySet();
    }
    return Collections.unmodifiableSet(partStates);
  }

  public void addPartState(PartState partState) {
    if (partStates == null) {
      this.partStates = new HashSet<>();
    }
    this.partStates.add(partState);
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
   public Design getDesign() {
    return design;
  }
  public DesignId getIdDesign() {
    return idDesign;
  }
  public void setIdDesign(DesignId idDesign) {
    this.idDesign = idDesign;
  }
   public PartState getPartState() {
    return partState;
  }
  public PartStateId getIdPartState() {
    return idPartState;
  }
  public void setIdPartState(PartStateId idPartState) {
    this.idPartState = idPartState;
  }


}