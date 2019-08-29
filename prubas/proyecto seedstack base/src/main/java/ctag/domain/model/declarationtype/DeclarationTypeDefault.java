package ctag.application.factoryimpl.declarationtype;


import ctag.domain.model.declarationType.*;

import org.seedstack.business.domain.BaseFactory; 

public class DeclarationTypeDefault extends BaseFactory<DeclarationType> implements DeclarationTypeFactory {

  @Override
  public DeclarationType createDeclarationType(String name) {

    DeclarationType tmpDeclarationType = create();


  tmpDeclarationType.setName(name);

    return tmpDeclarationType;
  }

}
