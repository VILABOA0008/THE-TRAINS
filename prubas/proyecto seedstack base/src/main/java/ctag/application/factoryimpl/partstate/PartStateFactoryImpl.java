package ctag.application.factoryimpl.partstate;


import ctag.domain.model.partState.*;

import org.seedstack.business.domain.BaseFactory; 

public class PartStateFactoryImpl extends BaseFactory<PartState> implements PartStateFactory {

  @Override
  public PartState createPartState(String name) {

    PartState tmpPartState = create();


  tmpPartState.setName(name);

    return tmpPartState;
  }

}
