package ctag.application.factoryimpl.launchmodifiedparameter;


import ctag.domain.model.launchModifiedParameter.*;

import org.seedstack.business.domain.BaseFactory; 

public class LaunchModifiedParameterDefault extends BaseFactory<LaunchModifiedParameter> implements LaunchModifiedParameterFactory {

  @Override
  public LaunchModifiedParameter createLaunchModifiedParameter(Integer idConfiguredParameter,Integer idLaunch,float value,boolean booleanValue,String comment,Integer idProcessVigilanceVersionParameter,Integer idProcessLaunch) {

    LaunchModifiedParameter tmpLaunchModifiedParameter = create();


  tmpLaunchModifiedParameter.setIdConfiguredParameter(idConfiguredParameter);
  tmpLaunchModifiedParameter.setIdLaunch(idLaunch);
  tmpLaunchModifiedParameter.setValue(value);
  tmpLaunchModifiedParameter.setBooleanValue(booleanValue);
  tmpLaunchModifiedParameter.setComment(comment);
  tmpLaunchModifiedParameter.setIdProcessVigilanceVersionParameter(new ProcessVigilanceVersionParameterId(idProcessVigilanceVersionParameter));
  tmpLaunchModifiedParameter.setIdProcessLaunch(new ProcessLaunchId(idProcessLaunch));

    return tmpLaunchModifiedParameter;
  }

}
