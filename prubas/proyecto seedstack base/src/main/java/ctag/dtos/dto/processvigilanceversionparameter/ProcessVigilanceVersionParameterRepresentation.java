package ctag.dtos.dto.processvigilanceversionparameter;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceVersionParameter;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilanceVersionParameter.class)
@ApiModel(value = " ProcessVigilanceVersionParameter ")
public class ProcessVigilanceVersionParameterCreateDto {

  private Integer idProcessVigilanceVersionParameter;
private Integer idProcessVigilanceVersion;
private Integer idParameter;
private Integer point;
private float nominal;
private boolean booleanNominal;
private Integer idProcessVigilanceVersion;
private Integer idParameter;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdProcessVigilanceVersionParameter() {
    return idProcessVigilanceVersionParameter;
  }

  @JsonProperty(value = "idProcessVigilanceVersion")
  @ApiModelProperty(value = "idProcessVigilanceVersion")
  @FactoryArgument(index = 0)
  public Integer getIdProcessVigilanceVersion() {
    return idProcessVigilanceVersion;  }

  @JsonProperty(value = "idParameter")
  @ApiModelProperty(value = "idParameter")
  @FactoryArgument(index = 1)
  public Integer getIdParameter() {
    return idParameter;  }

  @JsonProperty(value = "point")
  @ApiModelProperty(value = "point")
  @FactoryArgument(index = 2)
  public Integer getPoint() {
    return point;  }

  @JsonProperty(value = "nominal")
  @ApiModelProperty(value = "nominal")
  @FactoryArgument(index = 3)
  public float getNominal() {
    return nominal;  }

  @JsonProperty(value = "booleanNominal")
  @ApiModelProperty(value = "booleanNominal")
  @FactoryArgument(index = 4)
  public boolean getBooleanNominal() {
    return booleanNominal;  }

  @MatchingFactoryParameter(index = 5)
  public Integer getIdProcessVigilanceVersion() {
    return idProcessVigilanceVersion;  }

  @MatchingFactoryParameter(index = 6)
  public Integer getIdParameter() {
    return idParameter;  }

  public void setIdProcessVigilanceVersion(Integer  idProcessVigilanceVersion) {
    this.idProcessVigilanceVersion = idProcessVigilanceVersion;  }

  public void setIdParameter(Integer  idParameter) {
    this.idParameter = idParameter;  }

  public void setPoint(Integer  point) {
    this.point = point;  }

  public void setNominal(float  nominal) {
    this.nominal = nominal;  }

  public void setBooleanNominal(boolean  booleanNominal) {
    this.booleanNominal = booleanNominal;  }

  public void setIdProcessVigilanceVersionParameter(Integer idProcessVigilanceVersionParameter) {
    this.idProcessVigilanceVersionParameter = idProcessVigilanceVersionParameter;
  }  public void setIdProcessVigilanceVersion(Integer  idProcessVigilanceVersion) {
    this.idProcessVigilanceVersion = idProcessVigilanceVersion;  }

  public void setIdParameter(Integer  idParameter) {
    this.idParameter = idParameter;  }


}