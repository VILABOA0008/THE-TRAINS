package ctag.application.factoryimpl.bom;


import ctag.domain.model.bom.*;

import org.seedstack.business.domain.BaseFactory; 

public class BomDefault extends BaseFactory<Bom> implements BomFactory {

  @Override
  public Bom createBom(,Integer idDesign) {

    Bom tmpBom = create();


  tmpBom.setIdDesign(new DesignId(idDesign));

    return tmpBom;
  }

}
