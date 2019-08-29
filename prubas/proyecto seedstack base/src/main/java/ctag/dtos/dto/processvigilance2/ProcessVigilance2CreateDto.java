package ctag.dtos.dto.processvigilance2;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilance2;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilance2.class)
@ApiModel(value = " ProcessVigilance2 ")
public class ProcessVigilance2CreateDto {

private String name;
private Integer cHR;
private String programNumber;
private Integer idBom;
private Integer idLine;
private Integer idProcessVigilanceState;
private Integer idSourceMaterialType;


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

  @JsonProperty(value = "idBom")
  @ApiModelProperty(value = "idBom") 
  @FactoryArgument(index = 3)
  public Integer getIdBom() {
    return idBom;  }

  @JsonProperty(value = "idLine")
  @ApiModelProperty(value = "idLine") 
  @FactoryArgument(index = 4)
  public Integer getIdLine() {
    return idLine;  }

  @JsonProperty(value = "idProcessVigilanceState")
  @ApiModelProperty(value = "idProcessVigilanceState") 
  @FactoryArgument(index = 5)
  public Integer getIdProcessVigilanceState() {
    return idProcessVigilanceState;  }

  @JsonProperty(value = "idSourceMaterialType")
  @ApiModelProperty(value = "idSourceMaterialType") 
  @FactoryArgument(index = 6)
  public Integer getIdSourceMaterialType() {
    return idSourceMaterialType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setCHR(Integer  cHR) {
    this.cHR = cHR;  }

  public void setProgramNumber(String  programNumber) {
    this.programNumber = programNumber;  }

  public void setIdBom(Integer  idBom) {
    this.idBom = idBom;  }

  public void setIdLine(Integer  idLine) {
    this.idLine = idLine;  }

  public void setIdProcessVigilanceState(Integer  idProcessVigilanceState) {
    this.idProcessVigilanceState = idProcessVigilanceState;  }

  public void setIdSourceMaterialType(Integer  idSourceMaterialType) {
    this.idSourceMaterialType = idSourceMaterialType;  }


}