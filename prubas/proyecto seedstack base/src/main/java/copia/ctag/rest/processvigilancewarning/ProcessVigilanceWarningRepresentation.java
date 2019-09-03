package ctag.dtos.dto.processvigilancewarning;


import java.time.LocalDateTime;

import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.processvigilancewarning.ProcessVigilanceWarning;

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