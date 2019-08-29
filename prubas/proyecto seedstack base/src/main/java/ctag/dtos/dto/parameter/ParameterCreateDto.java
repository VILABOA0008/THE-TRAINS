package ctag.dtos.dto.parameter;


import ctag.domain.model.aggregate.modelospruebas.Parameter;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Parameter.class)
@ApiModel(value = " Parameter ")
public class ParameterCreateDto {

private String name;
private boolean hasPoints;
private Integer idParameterType;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "hasPoints")
  @ApiModelProperty(value = "hasPoints")
  @FactoryArgument(index = 1)
  public boolean getHasPoints() {
    return hasPoints;  }

  @JsonProperty(value = "idParameterType")
  @ApiModelProperty(value = "idParameterType") 
  @FactoryArgument(index = 2)
  public Integer getIdParameterType() {
    return idParameterType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setHasPoints(boolean  hasPoints) {
    this.hasPoints = hasPoints;  }

  public void setIdParameterType(Integer  idParameterType) {
    this.idParameterType = idParameterType;  }


}