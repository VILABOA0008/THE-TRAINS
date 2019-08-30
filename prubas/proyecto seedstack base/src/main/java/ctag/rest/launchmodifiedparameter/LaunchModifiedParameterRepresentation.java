package ctag.dtos.dto.launchmodifiedparameter;


import ctag.domain.model.aggregate.modelospruebas.LaunchModifiedParameter;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(LaunchModifiedParameter.class)
public class LaunchModifiedParameterRepresentation {

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

 @MatchingFactoryParameter(index = 1)
  public Integer getIdConfiguredParameter() {
    return idConfiguredParameter;  }

 @MatchingFactoryParameter(index = 2)
  public Integer getIdLaunch() {
    return idLaunch;  }

 @MatchingFactoryParameter(index = 3)
  public float getValue() {
    return value;  }

 @MatchingFactoryParameter(index = 4)
  public boolean getBooleanValue() {
    return booleanValue;  }

 @MatchingFactoryParameter(index = 5)
  public String getComment() {
    return comment;  }

  @MatchingFactoryParameter(index = 6)
  public Integer getIdProcessVigilanceVersionParameter() {
    return idProcessVigilanceVersionParameter;  }

  @MatchingFactoryParameter(index = 7)
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