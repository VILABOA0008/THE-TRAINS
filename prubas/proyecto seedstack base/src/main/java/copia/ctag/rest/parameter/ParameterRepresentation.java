package ctag.dtos.dto.parameter;


import ctag.domain.model.aggregate.modelospruebas.Parameter;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Parameter.class)
public class ParameterRepresentation {

  private Integer idParameter;
private String name;
private boolean hasPoints;
private Integer idParameterType;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdParameter() {
    return idParameter;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

 @MatchingFactoryParameter(index = 2)
  public boolean getHasPoints() {
    return hasPoints;  }

  @MatchingFactoryParameter(index = 3)
  public Integer getIdParameterType() {
    return idParameterType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setHasPoints(boolean  hasPoints) {
    this.hasPoints = hasPoints;  }

  public void setIdParameter(Integer idParameter) {
    this.idParameter = idParameter;
  }  public void setIdParameterType(Integer  idParameterType) {
    this.idParameterType = idParameterType;  }


}