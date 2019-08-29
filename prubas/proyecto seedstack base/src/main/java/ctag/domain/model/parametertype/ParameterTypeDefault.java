package ctag.application.factoryimpl.parametertype;


import ctag.domain.model.parameterType.*;

import org.seedstack.business.domain.BaseFactory; 

public class ParameterTypeDefault extends BaseFactory<ParameterType> implements ParameterTypeFactory {

  @Override
  public ParameterType createParameterType(String name) {

    ParameterType tmpParameterType = create();


  tmpParameterType.setName(name);

    return tmpParameterType;
  }

}
