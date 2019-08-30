package ctag.dtos.dto.launchmodifiedparameter;


import ctag.domain.model.aggregate.modelospruebas.LaunchModifiedParameter;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(LaunchModifiedParameter.class)
@ApiModel(value = " LaunchModifiedParameter ")
public class LaunchModifiedParameterCreateDto {

  private Integer idLaunchModifiedParameter;
private Integer idConfiguredParameter;
private Integer idLaunch;
private float value;
private boolean booleanValue;
private String comment;
private Integer idProcessVigilanceVersionParameter;
private Integer idProcessLaunch;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdLaunchModifiedParameter() {
    return idLaunchModifiedParameter;
  }

  @JsonProperty(value = "idConfiguredParameter")
  @ApiModelProperty(value = "idConfiguredParameter")
  @FactoryArgument(index = 0)
  public Integer getIdConfiguredParameter() {
    return idConfiguredParameter;  }

  @JsonProperty(value = "idLaunch")
  @ApiModelProperty(value = "idLaunch")
  @FactoryArgument(index = 1)
  public Integer getIdLaunch() {
    return idLaunch;  }

  @JsonProperty(value = "value")
  @ApiModelProperty(value = "value")
  @FactoryArgument(index = 2)
  public float getValue() {
    return value;  }

  @JsonProperty(value = "booleanValue")
  @ApiModelProperty(value = "booleanValue")
  @FactoryArgument(index = 3)
  public boolean getBooleanValue() {
    return booleanValue;  }

  @JsonProperty(value = "comment")
  @ApiModelProperty(value = "comment")
  @FactoryArgument(index = 4)
  public String getComment() {
    return comment;  }

  @MatchingFactoryParameter(index = 5)
  public Integer getIdProcessVigilanceVersionParameter() {
    return idProcessVigilanceVersionParameter;  }

  @MatchingFactoryParameter(index = 6)
  public Integer getIdProcessLaunch() {
    return idProcessLaunch;  }

  public void setIdConfiguredParameter(Integer  idConfiguredParameter) {
    this.idConfiguredParameter = idConfiguredParameter;  }

  public void setIdLaunch(Integer  idLaunch) {
    this.idLaunch = idLaunch;  }

  public void setValue(float  value) {
    this.value = value;  }

  public void setBooleanValue(boolean  booleanValue) {
    this.booleanValue = booleanValue;  }

  public void setComment(String  comment) {
    this.comment = comment;  }

  public void setIdLaunchModifiedParameter(Integer idLaunchModifiedParameter) {
    this.idLaunchModifiedParameter = idLaunchModifiedParameter;
  }  public void setIdProcessVigilanceVersionParameter(Integer  idProcessVigilanceVersionParameter) {
    this.idProcessVigilanceVersionParameter = idProcessVigilanceVersionParameter;  }

  public void setIdProcessLaunch(Integer  idProcessLaunch) {
    this.idProcessLaunch = idProcessLaunch;  }


}