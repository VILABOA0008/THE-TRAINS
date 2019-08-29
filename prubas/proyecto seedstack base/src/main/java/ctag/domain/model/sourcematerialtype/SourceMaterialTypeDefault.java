package ctag.application.factoryimpl.sourcematerialtype;


import ctag.domain.model.sourceMaterialType.*;

import org.seedstack.business.domain.BaseFactory; 

public class SourceMaterialTypeDefault extends BaseFactory<SourceMaterialType> implements SourceMaterialTypeFactory {

  @Override
  public SourceMaterialType createSourceMaterialType(String name) {

    SourceMaterialType tmpSourceMaterialType = create();


  tmpSourceMaterialType.setName(name);

    return tmpSourceMaterialType;
  }

}
