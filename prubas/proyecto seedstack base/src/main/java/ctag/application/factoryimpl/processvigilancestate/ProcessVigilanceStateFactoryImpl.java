ackage ctag.application.factoryimpl.processvigilancestate;


import ctag.domain.model.processVigilanceState.*;

import org.seedstack.business.domain.BaseFactory; 

public class ProcessVigilanceStateFactoryImpl extends BaseFactory<ProcessVigilanceState> implements ProcessVigilanceStateFactory {

  @Override
  public ProcessVigilanceState createProcessVigilanceState(String name) {

    ProcessVigilanceState tmpProcessVigilanceState = create();


  tmpProcessVigilanceState.setName(name);

    return tmpProcessVigilanceState;
  }

}