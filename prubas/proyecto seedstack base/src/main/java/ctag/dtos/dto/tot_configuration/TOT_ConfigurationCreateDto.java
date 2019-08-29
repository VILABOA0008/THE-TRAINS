package ctag.dtos.dto.tot_configuration;


import ctag.domain.model.aggregate.modelospruebas.TOT_Configuration;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(TOT_Configuration.class)
@ApiModel(value = " TOT_Configuration ")
public class TOT_ConfigurationCreateDto {

private String value;


  @JsonProperty(value = "value")
  @ApiModelProperty(value = "value")
  @FactoryArgument(index = 0)
  public String getValue() {
    return value;  }

  public void setValue(String  value) {
    this.value = value;  }


}