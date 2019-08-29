package ctag.dtos.dto.processvigilancestate;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceState;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(ProcessVigilanceState.class)
@ApiModel(value = " ProcessVigilanceState ")
public class ProcessVigilanceStateCreateDto {

private String name;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }


}