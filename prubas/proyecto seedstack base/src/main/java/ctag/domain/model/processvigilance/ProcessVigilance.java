package ctag.domain.model.processvigilance;

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
@Table(name = ProcessVigilance.TABLE_NAME)
@IdClass(ProcessVigilanceId.class)
public class ProcessVigilance extends BaseAggregateRoot<ProcessVigilanceId> {
   
public static final String TABLE_NAME = "ProcessVigilance";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PROCESSVIGILANCE = " idProcessVigilance ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_C_H_R = "C_H_R";
private static final String FIELD_PROGRAM_NUMBER = "Program_Number";   
public static final String FK_BOM = "FK_Bom";   
public static final String FK_LINE = "FK_Line";   
public static final String FK_STATE = "FK_State";   
public static final String FK_SOURCEMATERIAL = "FK_SourceMaterial";   
private static final String MAPPED_BY_PROCESS_VIGILANCE = "processVigilance";   
private static final String GENERATOR = "ProcessVigilanceGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PROCESSVIGILANCE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_C_H_R,unique = false,  nullable = false)
  private Integer cHR;

  @Column(name = FIELD_PROGRAM_NUMBER,unique = false,  nullable = false)
  private String programNumber;

  ProcessVigilance() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_BOM, nullable = false, insertable = false, updatable = false)
  private Bom bom;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_BOM, nullable = true))
  private BomId  idBom;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_LINE, nullable = false, insertable = false, updatable = false)
  private Line line;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_LINE, nullable = true))
  private LineId  idLine;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_STATE, nullable = false, insertable = false, updatable = false)
  private ProcessVigilanceState processVigilanceState;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_STATE, nullable = true))
  private ProcessVigilanceStateId  idProcessVigilanceState;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_SOURCEMATERIAL, nullable = false, insertable = false, updatable = false)
  private SourceMaterialType sourceMaterialType;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_SOURCEMATERIAL, nullable = true))
  private SourceMaterialTypeId  idSourceMaterialType;


  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Bom> boms;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Line> lines;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceState> processVigilanceStates;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<SourceMaterialType> sourceMaterialTypes;

  @OneToMany(mappedBy = MAPPED_BY_PROCESS_VIGILANCE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<ProcessVigilanceVersion> processVigilanceVersions;



  @Override
  public ProcessVigilanceId getId() {
    return new ProcessVigilanceId(id);
  }

  public String getName() {
    return name;
  }
  public Integer getCHR() {
    return cHR;
  }
  public String getProgramNumber() {
    return programNumber;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setCHR(Integer cHR) {
    this.cHR = cHR;
  }
  public void setProgramNumber(String programNumber) {
    this.programNumber = programNumber;
  }
  public Set<Bom> getBoms() {
    if (boms == null) {
      return Collections.<Bom>emptySet();
    }
    return Collections.unmodifiableSet(boms);
  }

  public void addBom(Bom bom) {
    if (boms == null) {
      this.boms = new HashSet<>();
    }
    this.boms.add(bom);
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
  public Set<ProcessVigilanceState> getProcessVigilanceStates() {
    if (processVigilanceStates == null) {
      return Collections.<ProcessVigilanceState>emptySet();
    }
    return Collections.unmodifiableSet(processVigilanceStates);
  }

  public void addProcessVigilanceState(ProcessVigilanceState processVigilanceState) {
    if (processVigilanceStates == null) {
      this.processVigilanceStates = new HashSet<>();
    }
    this.processVigilanceStates.add(processVigilanceState);
  }
  public Set<SourceMaterialType> getSourceMaterialTypes() {
    if (sourceMaterialTypes == null) {
      return Collections.<SourceMaterialType>emptySet();
    }
    return Collections.unmodifiableSet(sourceMaterialTypes);
  }

  public void addSourceMaterialType(SourceMaterialType sourceMaterialType) {
    if (sourceMaterialTypes == null) {
      this.sourceMaterialTypes = new HashSet<>();
    }
    this.sourceMaterialTypes.add(sourceMaterialType);
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
   public Bom getBom() {
    return bom;
  }
  public BomId getIdBom() {
    return idBom;
  }
  public void setIdBom(BomId idBom) {
    this.idBom = idBom;
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
   public ProcessVigilanceState getProcessVigilanceState() {
    return processVigilanceState;
  }
  public ProcessVigilanceStateId getIdProcessVigilanceState() {
    return idProcessVigilanceState;
  }
  public void setIdProcessVigilanceState(ProcessVigilanceStateId idProcessVigilanceState) {
    this.idProcessVigilanceState = idProcessVigilanceState;
  }
   public SourceMaterialType getSourceMaterialType() {
    return sourceMaterialType;
  }
  public SourceMaterialTypeId getIdSourceMaterialType() {
    return idSourceMaterialType;
  }
  public void setIdSourceMaterialType(SourceMaterialTypeId idSourceMaterialType) {
    this.idSourceMaterialType = idSourceMaterialType;
  }


}