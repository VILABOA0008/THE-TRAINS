package ctag.dtos.dto.line;


import ctag.domain.model.aggregate.modelospruebas.Line;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Line.class)
@ApiModel(value = " Line ")
public class LineCreateDto {

private String name;
private Integer idLineType;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "idLineType")
  @ApiModelProperty(value = "idLineType") 
  @FactoryArgument(index = 1)
  public Integer getIdLineType() {
    return idLineType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdLineType(Integer  idLineType) {
    this.idLineType = idLineType;  }


}