package ctag.dtos.dto.coillaunch;


import ctag.domain.model.aggregate.modelospruebas.CoilLaunch;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(CoilLaunch.class)
public class CoilLaunchRepresentation {

  private Integer idCoilLaunch;
private String coilNumber;
private Integer idProcessLaunch;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdCoilLaunch() {
    return idCoilLaunch;
  }

 @MatchingFactoryParameter(index = 1)
  public String getCoilNumber() {
    return coilNumber;  }

  @MatchingFactoryParameter(index = 2)
  public Integer getIdProcessLaunch() {
    return idProcessLaunch;  }

  public void setCoilNumber(String  coilNumber) {
    this.coilNumber = coilNumber;  }

  public void setIdCoilLaunch(Integer idCoilLaunch) {
    this.idCoilLaunch = idCoilLaunch;
  }  public void setIdProcessLaunch(Integer  idProcessLaunch) {
    this.idProcessLaunch = idProcessLaunch;  }


}