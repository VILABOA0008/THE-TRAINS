package ctag.domain.model.processlaunch;


public interface ProcessLaunchFactory extends GenericFactory<ProcessLaunch> {
  
 ProcessLaunch createProcessLaunch(Integer stamps,LocalDateTime launchTime,boolean modifiesParameter,Integer idPsaShift,Integer idProcessVigilanceVersion,Integer idAccount);

 ProcessLaunch createProcessLaunch(Integer ProcessLaunchId, Integer stamps,LocalDateTime launchTime,boolean modifiesParameter,Integer idPsaShift,Integer idProcessVigilanceVersion,Integer idAccount);


}
