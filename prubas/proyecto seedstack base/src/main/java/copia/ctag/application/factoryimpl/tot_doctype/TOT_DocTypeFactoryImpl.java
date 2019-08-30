package ctag.application.factoryimpl.tot_doctype;


import ctag.domain.model.tOT_DocType.*;

import org.seedstack.business.domain.BaseFactory; 

public class TOT_DocTypeFactoryImpl extends BaseFactory<TOT_DocType> implements TOT_DocTypeFactory {

  @Override
  public TOT_DocType createTOT_DocType(String name) {

    TOT_DocType tmpTOT_DocType = create();


  tmpTOT_DocType.setName(name);

    return tmpTOT_DocType;
  }

}
