package ctag.dtos.dto.tot_doctype;


import ctag.domain.model.aggregate.modelospruebas.Tot_doctype;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Tot_doctype.class)
@ApiModel(value = " Tot_doctype ")
public class Tot_doctypeCreateDto {

private String name;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }


}