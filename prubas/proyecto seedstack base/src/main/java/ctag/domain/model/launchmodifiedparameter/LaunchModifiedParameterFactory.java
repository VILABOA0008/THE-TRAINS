package ctag.domain.model.launchmodifiedparameter;


public interface LaunchModifiedParameterFactory extends GenericFactory<LaunchModifiedParameter> {
  
 LaunchModifiedParameter createLaunchModifiedParameter(Integer idConfiguredParameter,Integer idLaunch,float value,boolean booleanValue,String comment,Integer idProcessVigilanceVersionParameter,Integer idProcessLaunch);

 LaunchModifiedParameter createLaunchModifiedParameter(Integer LaunchModifiedParameterId, Integer idConfiguredParameter,Integer idLaunch,float value,boolean booleanValue,String comment,Integer idProcessVigilanceVersionParameter,Integer idProcessLaunch);


}
