package ctag.application.factoryimpl.design;


import ctag.domain.model.design.*;

import org.seedstack.business.domain.BaseFactory; 

public class DesignDefault extends BaseFactory<Design> implements DesignFactory {

  @Override
  public Design createDesign(String name,String code) {

    Design tmpDesign = create();


  tmpDesign.setName(name);
  tmpDesign.setCode(code);

    return tmpDesign;
  }

}
