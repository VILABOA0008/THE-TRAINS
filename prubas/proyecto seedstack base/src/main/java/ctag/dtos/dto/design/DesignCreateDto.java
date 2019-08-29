package ctag.dtos.dto.design;


import ctag.domain.model.aggregate.modelospruebas.Design;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Design.class)
@ApiModel(value = " Design ")
public class DesignCreateDto {

private String name;
private String code;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "code")
  @ApiModelProperty(value = "code")
  @FactoryArgument(index = 1)
  public String getCode() {
    return code;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setCode(String  code) {
    this.code = code;  }


}