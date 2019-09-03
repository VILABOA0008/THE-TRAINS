package ctag.dtos.dto.coillaunch;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.coillaunch.CoilLaunch;

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