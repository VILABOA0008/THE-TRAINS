package ctag.application.factoryimpl.coillaunch;


import ctag.domain.model.coilLaunch.*;

import org.seedstack.business.domain.BaseFactory; 

public class CoilLaunchDefault extends BaseFactory<CoilLaunch> implements CoilLaunchFactory {

  @Override
  public CoilLaunch createCoilLaunch(String coilNumber,Integer idProcessLaunch) {

    CoilLaunch tmpCoilLaunch = create();


  tmpCoilLaunch.setCoilNumber(coilNumber);
  tmpCoilLaunch.setIdProcessLaunch(new ProcessLaunchId(idProcessLaunch));

    return tmpCoilLaunch;
  }

}
