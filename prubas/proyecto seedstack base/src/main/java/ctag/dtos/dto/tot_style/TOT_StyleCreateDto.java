package ctag.dtos.dto.tot_style;


import ctag.domain.model.aggregate.modelospruebas.Tot_style;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Tot_style.class)
@ApiModel(value = " Tot_style ")
public class Tot_styleCreateDto {

private String name;
private String styleClass;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "styleClass")
  @ApiModelProperty(value = "styleClass")
  @FactoryArgument(index = 1)
  public String getStyleClass() {
    return styleClass;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setStyleClass(String  styleClass) {
    this.styleClass = styleClass;  }


}