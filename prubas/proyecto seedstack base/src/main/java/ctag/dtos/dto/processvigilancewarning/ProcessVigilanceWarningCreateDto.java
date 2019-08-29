package ctag.dtos.dto.processvigilancewarning;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceWarning;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilanceWarning.class)
@ApiModel(value = " ProcessVigilanceWarning ")
public class ProcessVigilanceWarningCreateDto {

private LocalDateTime validation;
private Integer idAccount;
private Integer idProcessVigilanceVersionParameter;


  @JsonProperty(value = "validation")
  @ApiModelProperty(value = "validation")
  @FactoryArgument(index = 0)
  public LocalDateTime getValidation() {
    return validation;  }

  @JsonProperty(value = "idAccount")
  @ApiModelProperty(value = "idAccount") 
  @FactoryArgument(index = 1)
  public Integer getIdAccount() {
    return idAccount;  }

  @JsonProperty(value = "idProcessVigilanceVersionParameter")
  @ApiModelProperty(value = "idProcessVigilanceVersionParameter") 
  @FactoryArgument(index = 2)
  public Integer getIdProcessVigilanceVersionParameter() {
    return idProcessVigilanceVersionParameter;  }

  public void setValidation(LocalDateTime  validation) {
    this.validation = validation;  }

  public void setIdAccount(Integer  idAccount) {
    this.idAccount = idAccount;  }

  public void setIdProcessVigilanceVersionParameter(Integer  idProcessVigilanceVersionParameter) {
    this.idProcessVigilanceVersionParameter = idProcessVigilanceVersionParameter;  }


}