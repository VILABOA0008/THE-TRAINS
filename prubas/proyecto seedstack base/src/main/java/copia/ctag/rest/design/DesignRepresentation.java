package ctag.dtos.dto.design;


import ctag.domain.model.aggregate.modelospruebas.Design;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Design.class)
public class DesignRepresentation {

  private Integer idDesign;
private String name;
private String code;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdDesign() {
    return idDesign;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

 @MatchingFactoryParameter(index = 2)
  public String getCode() {
    return code;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setCode(String  code) {
    this.code = code;  }

  public void setIdDesign(Integer idDesign) {
    this.idDesign = idDesign;
  }
}