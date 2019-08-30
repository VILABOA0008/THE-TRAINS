package ctag.application.factoryimpl.tot_style;


import ctag.domain.model.tOT_Style.*;

import org.seedstack.business.domain.BaseFactory; 

public class TOT_StyleFactoryImpl extends BaseFactory<TOT_Style> implements TOT_StyleFactory {

  @Override
  public TOT_Style createTOT_Style(String name,String styleClass) {

    TOT_Style tmpTOT_Style = create();


  tmpTOT_Style.setName(name);
  tmpTOT_Style.setStyleClass(styleClass);

    return tmpTOT_Style;
  }

}
