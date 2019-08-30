package ctag.dtos.dto.processlaunch;


import ctag.domain.model.aggregate.modelospruebas.ProcessLaunch;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessLaunch.class)
@ApiModel(value = " ProcessLaunch ")
public class ProcessLaunchCreateDto {

  private Integer idProcessLaunch;
private Integer stamps;
private LocalDateTime launchTime;
private boolean modifiesParameter;
private Integer idPsaShift;
private Integer idProcessVigilanceVersion;
private Integer idAccount;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdProcessLaunch() {
    return idProcessLaunch;
  }

  @JsonProperty(value = "stamps")
  @ApiModelProperty(value = "stamps")
  @FactoryArgument(index = 0)
  public Integer getStamps() {
    return stamps;  }

  @JsonProperty(value = "launchTime")
  @ApiModelProperty(value = "launchTime")
  @FactoryArgument(index = 1)
  public LocalDateTime getLaunchTime() {
    return launchTime;  }

  @JsonProperty(value = "modifiesParameter")
  @ApiModelProperty(value = "modifiesParameter")
  @FactoryArgument(index = 2)
  public boolean getModifiesParameter() {
    return modifiesParameter;  }

  @MatchingFactoryParameter(index = 3)
  public Integer getIdPsaShift() {
    return idPsaShift;  }

  @MatchingFactoryParameter(index = 4)
  public Integer getIdProcessVigilanceVersion() {
    return idProcessVigilanceVersion;  }

  @MatchingFactoryParameter(index = 5)
  public Integer getIdAccount() {
    return idAccount;  }

  public void setStamps(Integer  stamps) {
    this.stamps = stamps;  }

  public void setLaunchTime(LocalDateTime  launchTime) {
    this.launchTime = launchTime;  }

  public void setModifiesParameter(boolean  modifiesParameter) {
    this.modifiesParameter = modifiesParameter;  }

  public void setIdProcessLaunch(Integer idProcessLaunch) {
    this.idProcessLaunch = idProcessLaunch;
  }  public void setIdPsaShift(Integer  idPsaShift) {
    this.idPsaShift = idPsaShift;  }

  public void setIdProcessVigilanceVersion(Integer  idProcessVigilanceVersion) {
    this.idProcessVigilanceVersion = idProcessVigilanceVersion;  }

  public void setIdAccount(Integer  idAccount) {
    this.idAccount = idAccount;  }


}