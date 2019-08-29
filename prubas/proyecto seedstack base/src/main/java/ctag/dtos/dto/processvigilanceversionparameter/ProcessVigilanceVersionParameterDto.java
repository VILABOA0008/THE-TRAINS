package ctag.dtos.dto.processvigilanceversionparameter;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessVigilanceVersionParameter  ")public class ProcessVigilanceVersionParameterDto extends ProcessVigilanceVersionParameterCreateDto {

  private Integer idProcessVigilanceVersionParameter;

  @JsonIgnore
@AggregateId
  private ProcessVigilanceVersionParameterId getId() {
    return new ProcessVigilanceVersionParameterId(idProcessVigilanceVersionParameter);
  }

  @JsonProperty("idProcessVigilanceVersionParameter")
  public Integer getIdProcessVigilanceVersionParameter() {
    return idProcessVigilanceVersionParameter;
  }

  public void setIdProcessVigilanceVersionParameter(Integer idProcessVigilanceVersionParameter) {
    this.idProcessVigilanceVersionParameter = idProcessVigilanceVersionParameter;
  }
}