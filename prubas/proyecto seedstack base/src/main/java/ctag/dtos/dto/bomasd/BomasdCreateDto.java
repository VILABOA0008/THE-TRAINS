package ctag.dtos.dto.bomasd;


import ctag.domain.model.aggregate.modelospruebas.Bomasd;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Bomasd.class)
@ApiModel(value = " Bomasd ")
public class BomasdCreateDto {

private Integer idDesign;


  @JsonProperty(value = "idDesign")
  @ApiModelProperty(value = "idDesign") 
  @FactoryArgument(index = 0)
  public Integer getIdDesign() {
    return idDesign;  }

  public void setIdDesign(Integer  idDesign) {
    this.idDesign = idDesign;  }


}