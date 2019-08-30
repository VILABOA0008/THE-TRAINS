package ctag.dtos.dto.reworkbatch;


import ctag.domain.model.aggregate.modelospruebas.ReworkBatch;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ReworkBatch.class)
public class ReworkBatchRepresentation {

  private Integer idReworkBatch;
private LocalDate batchDate;
private LocalDate productionDate;
private String reworkerRef;
private Integer reworkedParts;
private Integer nokParts;
private Integer badSrcParts;
private Integer time;
private String comment;
private Integer idLine;
private Integer idPsaShift;
private Integer idPart;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdReworkBatch() {
    return idReworkBatch;
  }

 @MatchingFactoryParameter(index = 1)
  public LocalDate getBatchDate() {
    return batchDate;  }

 @MatchingFactoryParameter(index = 2)
  public LocalDate getProductionDate() {
    return productionDate;  }

 @MatchingFactoryParameter(index = 3)
  public String getReworkerRef() {
    return reworkerRef;  }

 @MatchingFactoryParameter(index = 4)
  public Integer getReworkedParts() {
    return reworkedParts;  }

 @MatchingFactoryParameter(index = 5)
  public Integer getNokParts() {
    return nokParts;  }

 @MatchingFactoryParameter(index = 6)
  public Integer getBadSrcParts() {
    return badSrcParts;  }

 @MatchingFactoryParameter(index = 7)
  public Integer getTime() {
    return time;  }

 @MatchingFactoryParameter(index = 8)
  public String getComment() {
    return comment;  }

  @MatchingFactoryParameter(index = 9)
  public Integer getIdLine() {
    return idLine;  }

  @MatchingFactoryParameter(index = 10)
  public Integer getIdPsaShift() {
    return idPsaShift;  }

  @MatchingFactoryParameter(index = 11)
  public Integer getIdPart() {
    return idPart;  }

  public void setBatchDate(LocalDate  batchDate) {
    this.batchDate = batchDate;  }

  public void setProductionDate(LocalDate  productionDate) {
    this.productionDate = productionDate;  }

  public void setReworkerRef(String  reworkerRef) {
    this.reworkerRef = reworkerRef;  }

  public void setReworkedParts(Integer  reworkedParts) {
    this.reworkedParts = reworkedParts;  }

  public void setNokParts(Integer  nokParts) {
    this.nokParts = nokParts;  }

  public void setBadSrcParts(Integer  badSrcParts) {
    this.badSrcParts = badSrcParts;  }

  public void setTime(Integer  time) {
    this.time = time;  }

  public void setComment(String  comment) {
    this.comment = comment;  }

  public void setIdReworkBatch(Integer idReworkBatch) {
    this.idReworkBatch = idReworkBatch;
  }  public void setIdLine(Integer  idLine) {
    this.idLine = idLine;  }

  public void setIdPsaShift(Integer  idPsaShift) {
    this.idPsaShift = idPsaShift;  }

  public void setIdPart(Integer  idPart) {
    this.idPart = idPart;  }


}