package ctag.application.factoryimpl.parameter;


import ctag.domain.model.parameter.*;

import org.seedstack.business.domain.BaseFactory; 

public class ParameterDefault extends BaseFactory<Parameter> implements ParameterFactory {

  @Override
  public Parameter createParameter(String name,boolean hasPoints,Integer idParameterType) {

    Parameter tmpParameter = create();


  tmpParameter.setName(name);
  tmpParameter.setHasPoints(hasPoints);
  tmpParameter.setIdParameterType(new ParameterTypeId(idParameterType));

    return tmpParameter;
  }

}
