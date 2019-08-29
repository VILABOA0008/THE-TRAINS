package ctag.application.factoryimpl.processvigilanceversionparameter;


import ctag.domain.model.processVigilanceVersionParameter.*;

import org.seedstack.business.domain.BaseFactory; 

public class ProcessVigilanceVersionParameterDefault extends BaseFactory<ProcessVigilanceVersionParameter> implements ProcessVigilanceVersionParameterFactory {

  @Override
  public ProcessVigilanceVersionParameter createProcessVigilanceVersionParameter(Integer idProcessVigilanceVersion,Integer idParameter,Integer point,float nominal,boolean booleanNominal,Integer idProcessVigilanceVersion,Integer idParameter) {

    ProcessVigilanceVersionParameter tmpProcessVigilanceVersionParameter = create();


  tmpProcessVigilanceVersionParameter.setIdProcessVigilanceVersion(idProcessVigilanceVersion);
  tmpProcessVigilanceVersionParameter.setIdParameter(idParameter);
  tmpProcessVigilanceVersionParameter.setPoint(point);
  tmpProcessVigilanceVersionParameter.setNominal(nominal);
  tmpProcessVigilanceVersionParameter.setBooleanNominal(booleanNominal);
  tmpProcessVigilanceVersionParameter.setIdProcessVigilanceVersion(new ProcessVigilanceVersionId(idProcessVigilanceVersion));
  tmpProcessVigilanceVersionParameter.setIdParameter(new ParameterId(idParameter));

    return tmpProcessVigilanceVersionParameter;
  }

}
