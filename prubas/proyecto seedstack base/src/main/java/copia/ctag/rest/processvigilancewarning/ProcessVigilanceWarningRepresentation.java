package ctag.dtos.dto.processvigilancewarning;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceWarning;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilanceWarning.class)
public class ProcessVigilanceWarningRepresentation {

  private Integer idProcessVigilanceWarning;
private LocalDateTime validation;
private Integer idAccount;
private Integer idProcessVigilanceVersionParameter;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdProcessVigilanceWarning() {
    return idProcessVigilanceWarning;
  }

 @MatchingFactoryParameter(index = 1)
  public LocalDateTime getValidation() {
    return validation;  }

  @MatchingFactoryParameter(index = 2)
  public Integer getIdAccount() {
    return idAccount;  }

  @MatchingFactoryParameter(index = 3)
  public Integer getIdProcessVigilanceVersionParameter() {
    return idProcessVigilanceVersionParameter;  }

  public void setValidation(LocalDateTime  validation) {
    this.validation = validation;  }

  public void setIdProcessVigilanceWarning(Integer idProcessVigilanceWarning) {
    this.idProcessVigilanceWarning = idProcessVigilanceWarning;
  }  public void setIdAccount(Integer  idAccount) {
    this.idAccount = idAccount;  }

  public void setIdProcessVigilanceVersionParameter(Integer  idProcessVigilanceVersionParameter) {
    this.idProcessVigilanceVersionParameter = idProcessVigilanceVersionParameter;  }


}