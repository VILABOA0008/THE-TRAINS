package ctag.domain.model.reworkbatch;

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
@Table(name = ReworkBatch.TABLE_NAME)
@IdClass(ReworkBatchId.class)
public class ReworkBatch extends BaseAggregateRoot<ReworkBatchId> {
   
public static final String TABLE_NAME = "ReworkBatch";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_REWORKBATCH = " idReworkBatch ";
private static final String FIELD_BATCH_DATE = "Batch_Date";
private static final String FIELD_PRODUCTION_DATE = "Production_Date";
private static final String FIELD_REWORKER_REF = "Reworker_Ref";
private static final String FIELD_REWORKED_PARTS = "Reworked_Parts";
private static final String FIELD_NOK_PARTS = "Nok_Parts";
private static final String FIELD_BAD_SRC_PARTS = "Bad_Src_Parts";
private static final String FIELD_TIME = "Time";
private static final String FIELD_COMMENT = "Comment";   
public static final String FK_LINE = "FK_Line";   
public static final String FK_PSASHIFT = "FK_PsaShift";   
public static final String FK_REFERENCE = "FK_Reference";   
private static final String GENERATOR = "ReworkBatchGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_REWORKBATCH, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_BATCH_DATE,unique = false,  nullable = false)
  private LocalDate batchDate;

  @Column(name = FIELD_PRODUCTION_DATE,unique = false,  nullable = false)
  private LocalDate productionDate;

  @Column(name = FIELD_REWORKER_REF,unique = false,  nullable = false)
  private String reworkerRef;

  @Column(name = FIELD_REWORKED_PARTS,unique = false,  nullable = false)
  private Integer reworkedParts;

  @Column(name = FIELD_NOK_PARTS,unique = false,  nullable = false)
  private Integer nokParts;

  @Column(name = FIELD_BAD_SRC_PARTS,unique = false,  nullable = false)
  private Integer badSrcParts;

  @Column(name = FIELD_TIME,unique = false,  nullable = false)
  private Integer time;

  @Column(name = FIELD_COMMENT,unique = false,  nullable = false)
  private String comment;

  ReworkBatch() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_LINE, nullable = false, insertable = false, updatable = false)
  private Line line;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_LINE, nullable = true))
  private LineId  idLine;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PSASHIFT, nullable = false, insertable = false, updatable = false)
  private PsaShift psaShift;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_PSASHIFT, nullable = true))
  private PsaShiftId  idPsaShift;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_REFERENCE, nullable = false, insertable = false, updatable = false)
  private Part part;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_REFERENCE, nullable = true))
  private PartId  idPart;




  @Override
  public ReworkBatchId getId() {
    return new ReworkBatchId(id);
  }

  public LocalDate getBatchDate() {
    return batchDate;
  }
  public LocalDate getProductionDate() {
    return productionDate;
  }
  public String getReworkerRef() {
    return reworkerRef;
  }
  public Integer getReworkedParts() {
    return reworkedParts;
  }
  public Integer getNokParts() {
    return nokParts;
  }
  public Integer getBadSrcParts() {
    return badSrcParts;
  }
  public Integer getTime() {
    return time;
  }
  public String getComment() {
    return comment;
  }
  public void setBatchDate(LocalDate batchDate) {
    this.batchDate = batchDate;
  }
  public void setProductionDate(LocalDate productionDate) {
    this.productionDate = productionDate;
  }
  public void setReworkerRef(String reworkerRef) {
    this.reworkerRef = reworkerRef;
  }
  public void setReworkedParts(Integer reworkedParts) {
    this.reworkedParts = reworkedParts;
  }
  public void setNokParts(Integer nokParts) {
    this.nokParts = nokParts;
  }
  public void setBadSrcParts(Integer badSrcParts) {
    this.badSrcParts = badSrcParts;
  }
  public void setTime(Integer time) {
    this.time = time;
  }
  public void setComment(String comment) {
    this.comment = comment;
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
   public PsaShift getPsaShift() {
    return psaShift;
  }
  public PsaShiftId getIdPsaShift() {
    return idPsaShift;
  }
  public void setIdPsaShift(PsaShiftId idPsaShift) {
    this.idPsaShift = idPsaShift;
  }
   public Part getPart() {
    return part;
  }
  public PartId getIdPart() {
    return idPart;
  }
  public void setIdPart(PartId idPart) {
    this.idPart = idPart;
  }


}