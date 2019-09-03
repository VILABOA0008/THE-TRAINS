package ctag.dtos.dto.parameter;


import org.seedstack.business.assembler.DtoOf;

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