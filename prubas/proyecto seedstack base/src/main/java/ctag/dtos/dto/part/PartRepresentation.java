package ctag.dtos.dto.part;


import ctag.domain.model.aggregate.modelospruebas.Part;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Part.class)
@ApiModel(value = " Part ")
public class PartCreateDto {

  private Integer idPart;
private String name;
private Integer idDesign;
private Integer idPartState;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdPart() {
    return idPart;
  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @MatchingFactoryParameter(index = 1)
  public Integer getIdDesign() {
    return idDesign;  }

  @MatchingFactoryParameter(index = 2)
  public Integer getIdPartState() {
    return idPartState;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdPart(Integer idPart) {
    this.idPart = idPart;
  }  public void setIdDesign(Integer  idDesign) {
    this.idDesign = idDesign;  }

  public void setIdPartState(Integer  idPartState) {
    this.idPartState = idPartState;  }


}