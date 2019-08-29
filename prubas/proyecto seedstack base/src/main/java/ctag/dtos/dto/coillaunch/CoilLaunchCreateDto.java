package ctag.dtos.dto.coillaunch;


import ctag.domain.model.aggregate.modelospruebas.CoilLaunch;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(CoilLaunch.class)
@ApiModel(value = " CoilLaunch ")
public class CoilLaunchCreateDto {

private String coilNumber;
private Integer idProcessLaunch;


  @JsonProperty(value = "coilNumber")
  @ApiModelProperty(value = "coilNumber")
  @FactoryArgument(index = 0)
  public String getCoilNumber() {
    return coilNumber;  }

  @JsonProperty(value = "idProcessLaunch")
  @ApiModelProperty(value = "idProcessLaunch") 
  @FactoryArgument(index = 1)
  public Integer getIdProcessLaunch() {
    return idProcessLaunch;  }

  public void setCoilNumber(String  coilNumber) {
    this.coilNumber = coilNumber;  }

  public void setIdProcessLaunch(Integer  idProcessLaunch) {
    this.idProcessLaunch = idProcessLaunch;  }


}