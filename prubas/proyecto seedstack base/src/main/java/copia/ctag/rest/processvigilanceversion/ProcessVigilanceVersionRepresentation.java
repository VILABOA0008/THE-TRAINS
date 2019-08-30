package ctag.dtos.dto.processvigilanceversion;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceVersion;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilanceVersion.class)
public class ProcessVigilanceVersionRepresentation {

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

 @MatchingFactoryParameter(index = 1)
  public Integer getRevision() {
    return revision;  }

 @MatchingFactoryParameter(index = 2)
  public Integer getCreator() {
    return creator;  }

 @MatchingFactoryParameter(index = 3)
  public Integer getLastModifier() {
    return lastModifier;  }

 @MatchingFactoryParameter(index = 4)
  public Integer getState() {
    return state;  }

 @MatchingFactoryParameter(index = 5)
  public LocalDateTime getActivation() {
    return activation;  }

 @MatchingFactoryParameter(index = 6)
  public LocalDateTime getDeactivation() {
    return deactivation;  }

  @MatchingFactoryParameter(index = 7)
  public Integer getIdProcessVigilance() {
    return idProcessVigilance;  }

  @MatchingFactoryParameter(index = 8)
  public Integer getIdAccount() {
    return idAccount;  }

  @MatchingFactoryParameter(index = 9)
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