package ctag.dtos.dto.parametertype;


import org.hibernate.usertype.DynamicParameterizedType.ParameterType;
import org.seedstack.business.assembler.DtoOf;

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