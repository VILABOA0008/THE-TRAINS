package ctag.application.factoryimpl.launchdeclarations;


import ctag.domain.model.launchDeclarations.*;

import org.seedstack.business.domain.BaseFactory; 

public class LaunchDeclarationsDefault extends BaseFactory<LaunchDeclarations> implements LaunchDeclarationsFactory {

  @Override
  public LaunchDeclarations createLaunchDeclarations(Integer idDeclarationType,Integer quantity,Integer idDeclarationType) {

    LaunchDeclarations tmpLaunchDeclarations = create();


  tmpLaunchDeclarations.setIdDeclarationType(idDeclarationType);
  tmpLaunchDeclarations.setQuantity(quantity);
  tmpLaunchDeclarations.setIdDeclarationType(new DeclarationTypeId(idDeclarationType));

    return tmpLaunchDeclarations;
  }

}
