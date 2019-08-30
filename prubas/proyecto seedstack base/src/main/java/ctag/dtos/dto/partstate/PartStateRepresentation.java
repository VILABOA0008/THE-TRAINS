package ctag.dtos.dto.partstate;


import ctag.domain.model.aggregate.modelospruebas.PartState;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(PartState.class)
@ApiModel(value = " PartState ")
public class PartStateCreateDto {

  private Integer idPartState;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdPartState() {
    return idPartState;
  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdPartState(Integer idPartState) {
    this.idPartState = idPartState;
  }
}