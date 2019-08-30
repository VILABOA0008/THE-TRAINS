package ctag.dtos.dto.processvigilance;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilance;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilance.class)
@ApiModel(value = " ProcessVigilance ")
public class ProcessVigilanceCreateDto {

  private Integer idProcessVigilance;
private String name;
private Integer cHR;
private String programNumber;
private Integer idBom;
private Integer idLine;
private Integer idProcessVigilanceState;
private Integer idSourceMaterialType;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdProcessVigilance() {
    return idProcessVigilance;
  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "cHR")
  @ApiModelProperty(value = "cHR")
  @FactoryArgument(index = 1)
  public Integer getCHR() {
    return cHR;  }

  @JsonProperty(value = "programNumber")
  @ApiModelProperty(value = "programNumber")
  @FactoryArgument(index = 2)
  public String getProgramNumber() {
    return programNumber;  }

  @MatchingFactoryParameter(index = 3)
  public Integer getIdBom() {
    return idBom;  }

  @MatchingFactoryParameter(index = 4)
  public Integer getIdLine() {
    return idLine;  }

  @MatchingFactoryParameter(index = 5)
  public Integer getIdProcessVigilanceState() {
    return idProcessVigilanceState;  }

  @MatchingFactoryParameter(index = 6)
  public Integer getIdSourceMaterialType() {
    return idSourceMaterialType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setCHR(Integer  cHR) {
    this.cHR = cHR;  }

  public void setProgramNumber(String  programNumber) {
    this.programNumber = programNumber;  }

  public void setIdProcessVigilance(Integer idProcessVigilance) {
    this.idProcessVigilance = idProcessVigilance;
  }  public void setIdBom(Integer  idBom) {
    this.idBom = idBom;  }

  public void setIdLine(Integer  idLine) {
    this.idLine = idLine;  }

  public void setIdProcessVigilanceState(Integer  idProcessVigilanceState) {
    this.idProcessVigilanceState = idProcessVigilanceState;  }

  public void setIdSourceMaterialType(Integer  idSourceMaterialType) {
    this.idSourceMaterialType = idSourceMaterialType;  }


}