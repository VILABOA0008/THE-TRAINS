package ctag.dtos.dto.processvigilanceversion;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceVersion;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilanceVersion.class)
@ApiModel(value = " ProcessVigilanceVersion ")
public class ProcessVigilanceVersionCreateDto {

  private Integer idProcessVigilanceVersion;
private Integer revision;
private Integer creator;
private Integer lastModifier;
private Integer state;
private LocalDateTime activation;
private LocalDateTime deactivation;
private Integer idProcessVigilance;
private Integer idAccount;
private Integer idAccount;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdProcessVigilanceVersion() {
    return idProcessVigilanceVersion;
  }

  @JsonProperty(value = "revision")
  @ApiModelProperty(value = "revision")
  @FactoryArgument(index = 0)
  public Integer getRevision() {
    return revision;  }

  @JsonProperty(value = "creator")
  @ApiModelProperty(value = "creator")
  @FactoryArgument(index = 1)
  public Integer getCreator() {
    return creator;  }

  @JsonProperty(value = "lastModifier")
  @ApiModelProperty(value = "lastModifier")
  @FactoryArgument(index = 2)
  public Integer getLastModifier() {
    return lastModifier;  }

  @JsonProperty(value = "state")
  @ApiModelProperty(value = "state")
  @FactoryArgument(index = 3)
  public Integer getState() {
    return state;  }

  @JsonProperty(value = "activation")
  @ApiModelProperty(value = "activation")
  @FactoryArgument(index = 4)
  public LocalDateTime getActivation() {
    return activation;  }

  @JsonProperty(value = "deactivation")
  @ApiModelProperty(value = "deactivation")
  @FactoryArgument(index = 5)
  public LocalDateTime getDeactivation() {
    return deactivation;  }

  @MatchingFactoryParameter(index = 6)
  public Integer getIdProcessVigilance() {
    return idProcessVigilance;  }

  @MatchingFactoryParameter(index = 7)
  public Integer getIdAccount() {
    return idAccount;  }

  @MatchingFactoryParameter(index = 8)
  public Integer getIdAccount() {
    return idAccount;  }

  public void setRevision(Integer  revision) {
    this.revision = revision;  }

  public void setCreator(Integer  creator) {
    this.creator = creator;  }

  public void setLastModifier(Integer  lastModifier) {
    this.lastModifier = lastModifier;  }

  public void setState(Integer  state) {
    this.state = state;  }

  public void setActivation(LocalDateTime  activation) {
    this.activation = activation;  }

  public void setDeactivation(LocalDateTime  deactivation) {
    this.deactivation = deactivation;  }

  public void setIdProcessVigilanceVersion(Integer idProcessVigilanceVersion) {
    this.idProcessVigilanceVersion = idProcessVigilanceVersion;
  }  public void setIdProcessVigilance(Integer  idProcessVigilance) {
    this.idProcessVigilance = idProcessVigilance;  }

  public void setIdAccount(Integer  idAccount) {
    this.idAccount = idAccount;  }

  public void setIdAccount(Integer  idAccount) {
    this.idAccount = idAccount;  }


}