package ctag.dtos.dto.parametertype;


import ctag.domain.model.aggregate.modelospruebas.ParameterType;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ParameterType.class)
public class ParameterTypeRepresentation {

  private Integer idParameterType;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdParameterType() {
    return idParameterType;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdParameterType(Integer idParameterType) {
    this.idParameterType = idParameterType;
  }
}