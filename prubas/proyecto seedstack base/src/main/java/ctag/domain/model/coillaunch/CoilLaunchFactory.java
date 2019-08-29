package ctag.domain.model.coillaunch;


public interface CoilLaunchFactory extends GenericFactory<CoilLaunch> {
  
 CoilLaunch createCoilLaunch(String coilNumber,Integer idProcessLaunch);

 CoilLaunch createCoilLaunch(Integer CoilLaunchId, String coilNumber,Integer idProcessLaunch);


}
