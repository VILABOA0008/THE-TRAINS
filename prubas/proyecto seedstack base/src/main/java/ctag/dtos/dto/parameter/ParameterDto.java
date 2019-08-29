package ctag.dtos.dto.parameter;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Parameter  ")public class ParameterDto extends ParameterCreateDto {

  private Integer idParameter;

  @JsonIgnore
@AggregateId
  private ParameterId getId() {
    return new ParameterId(idParameter);
  }

  @JsonProperty("idParameter")
  public Integer getIdParameter() {
    return idParameter;
  }

  public void setIdParameter(Integer idParameter) {
    this.idParameter = idParameter;
  }
}