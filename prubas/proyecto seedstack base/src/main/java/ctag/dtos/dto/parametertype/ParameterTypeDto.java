package ctag.dtos.dto.parametertype;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ParameterType  ")public class ParameterTypeDto extends ParameterTypeCreateDto {

  private Integer idParameterType;

  @JsonIgnore
@AggregateId
  private ParameterTypeId getId() {
    return new ParameterTypeId(idParameterType);
  }

  @JsonProperty("idParameterType")
  public Integer getIdParameterType() {
    return idParameterType;
  }

  public void setIdParameterType(Integer idParameterType) {
    this.idParameterType = idParameterType;
  }
}