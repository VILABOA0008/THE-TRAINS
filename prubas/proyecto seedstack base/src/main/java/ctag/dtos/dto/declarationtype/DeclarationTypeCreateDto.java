package ctag.dtos.dto.declarationtype;


import ctag.domain.model.aggregate.modelospruebas.DeclarationType;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(DeclarationType.class)
@ApiModel(value = " DeclarationType ")
public class DeclarationTypeCreateDto {

private String name;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }


}