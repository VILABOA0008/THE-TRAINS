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
private Integer fK_Plant;
private Integer fK_Group;
private Integer idLineType;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "fK_Plant")
  @ApiModelProperty(value = "fK_Plant")
  @FactoryArgument(index = 1)
  public Integer getFK_Plant() {
    return fK_Plant;  }

  @JsonProperty(value = "fK_Group")
  @ApiModelProperty(value = "fK_Group")
  @FactoryArgument(index = 2)
  public Integer getFK_Group() {
    return fK_Group;  }

  @JsonProperty(value = "idLineType")
  @ApiModelProperty(value = "idLineType") 
  @FactoryArgument(index = 3)
  public Integer getIdLineType() {
    return idLineType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setFK_Plant(Integer  fK_Plant) {
    this.fK_Plant = fK_Plant;  }

  public void setFK_Group(Integer  fK_Group) {
    this.fK_Group = fK_Group;  }

  public void setIdLineType(Integer  idLineType) {
    this.idLineType = idLineType;  }


}