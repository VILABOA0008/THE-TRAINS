package ctag.dtos.dto.reworkbatch;


import ctag.domain.model.aggregate.modelospruebas.ReworkBatch;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ReworkBatch.class)
@ApiModel(value = " ReworkBatch ")
public class ReworkBatchCreateDto {

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


  @JsonProperty(value = "batchDate")
  @ApiModelProperty(value = "batchDate")
  @FactoryArgument(index = 0)
  public LocalDate getBatchDate() {
    return batchDate;  }

  @JsonProperty(value = "productionDate")
  @ApiModelProperty(value = "productionDate")
  @FactoryArgument(index = 1)
  public LocalDate getProductionDate() {
    return productionDate;  }

  @JsonProperty(value = "reworkerRef")
  @ApiModelProperty(value = "reworkerRef")
  @FactoryArgument(index = 2)
  public String getReworkerRef() {
    return reworkerRef;  }

  @JsonProperty(value = "reworkedParts")
  @ApiModelProperty(value = "reworkedParts")
  @FactoryArgument(index = 3)
  public Integer getReworkedParts() {
    return reworkedParts;  }

  @JsonProperty(value = "nokParts")
  @ApiModelProperty(value = "nokParts")
  @FactoryArgument(index = 4)
  public Integer getNokParts() {
    return nokParts;  }

  @JsonProperty(value = "badSrcParts")
  @ApiModelProperty(value = "badSrcParts")
  @FactoryArgument(index = 5)
  public Integer getBadSrcParts() {
    return badSrcParts;  }

  @JsonProperty(value = "time")
  @ApiModelProperty(value = "time")
  @FactoryArgument(index = 6)
  public Integer getTime() {
    return time;  }

  @JsonProperty(value = "comment")
  @ApiModelProperty(value = "comment")
  @FactoryArgument(index = 7)
  public String getComment() {
    return comment;  }

  @JsonProperty(value = "idLine")
  @ApiModelProperty(value = "idLine") 
  @FactoryArgument(index = 8)
  public Integer getIdLine() {
    return idLine;  }

  @JsonProperty(value = "idPsaShift")
  @ApiModelProperty(value = "idPsaShift") 
  @FactoryArgument(index = 9)
  public Integer getIdPsaShift() {
    return idPsaShift;  }

  @JsonProperty(value = "idPart")
  @ApiModelProperty(value = "idPart") 
  @FactoryArgument(index = 10)
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

  public void setIdLine(Integer  idLine) {
    this.idLine = idLine;  }

  public void setIdPsaShift(Integer  idPsaShift) {
    this.idPsaShift = idPsaShift;  }

  public void setIdPart(Integer  idPart) {
    this.idPart = idPart;  }


}