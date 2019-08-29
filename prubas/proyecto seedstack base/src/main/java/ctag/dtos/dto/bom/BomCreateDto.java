package ctag.dtos.dto.bom;


import ctag.domain.model.aggregate.modelospruebas.Bom;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Bom.class)
@ApiModel(value = " Bom ")
public class BomCreateDto {

private Integer idDesign;


  @JsonProperty(value = "idDesign")
  @ApiModelProperty(value = "idDesign") 
  @FactoryArgument(index = 0)
  public Integer getIdDesign() {
    return idDesign;  }

  public void setIdDesign(Integer  idDesign) {
    this.idDesign = idDesign;  }


}