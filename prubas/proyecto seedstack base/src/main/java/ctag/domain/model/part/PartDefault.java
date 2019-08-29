package ctag.application.factoryimpl.part;


import ctag.domain.model.part.*;

import org.seedstack.business.domain.BaseFactory; 

public class PartDefault extends BaseFactory<Part> implements PartFactory {

  @Override
  public Part createPart(String name,Integer idDesign,Integer idPartState) {

    Part tmpPart = create();


  tmpPart.setName(name);
  tmpPart.setIdDesign(new DesignId(idDesign));
  tmpPart.setIdPartState(new PartStateId(idPartState));

    return tmpPart;
  }

}
