package ctag.dtos.dto.linetype;


import ctag.domain.model.aggregate.modelospruebas.LineType;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(LineType.class)
@ApiModel(value = " LineType ")
public class LineTypeCreateDto {

  private Integer idLineType;
private String name;
private boolean active;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdLineType() {
    return idLineType;
  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "active")
  @ApiModelProperty(value = "active")
  @FactoryArgument(index = 1)
  public boolean getActive() {
    return active;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setIdLineType(Integer idLineType) {
    this.idLineType = idLineType;
  }
}