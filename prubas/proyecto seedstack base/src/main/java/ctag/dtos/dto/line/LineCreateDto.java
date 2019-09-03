package ctag.dtos.dto.line;


import org.seedstack.business.assembler.DtoOf;
import org.seedstack.business.assembler.FactoryArgument;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Line.class)
@ApiModel(value = " Line ")
public class LineCreateDto {

private String name;
private Integer plant;
private Integer group;
private Integer idLineType;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "plant")
  @ApiModelProperty(value = "plant")
  @FactoryArgument(index = 1)
  public Integer getPlant() {
    return plant;  }

  @JsonProperty(value = "group")
  @ApiModelProperty(value = "group")
  @FactoryArgument(index = 2)
  public Integer getGroup() {
    return group;  }

  @JsonProperty(value = "idLineType")
  @ApiModelProperty(value = "idLineType") 
  @FactoryArgument(index = 3)
  public Integer getIdLineType() {
    return idLineType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setPlant(Integer  plant) {
    this.plant = plant;  }

  public void setGroup(Integer  group) {
    this.group = group;  }

  public void setIdLineType(Integer  idLineType) {
    this.idLineType = idLineType;  }


}