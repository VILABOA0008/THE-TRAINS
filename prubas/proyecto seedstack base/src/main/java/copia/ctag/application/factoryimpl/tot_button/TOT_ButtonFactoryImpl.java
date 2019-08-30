package ctag.application.factoryimpl.tot_button;


import ctag.domain.model.tOT_Button.*;

import org.seedstack.business.domain.BaseFactory; 

public class TOT_ButtonFactoryImpl extends BaseFactory<TOT_Button> implements TOT_ButtonFactory {

  @Override
  public TOT_Button createTOT_Button(String name,String shortName,Integer x,Integer y,Integer w,Integer h,boolean active,Integer order,Integer idTOT_Page) {

    TOT_Button tmpTOT_Button = create();


  tmpTOT_Button.setName(name);
  tmpTOT_Button.setShortName(shortName);
  tmpTOT_Button.setX(x);
  tmpTOT_Button.setY(y);
  tmpTOT_Button.setW(w);
  tmpTOT_Button.setH(h);
  tmpTOT_Button.setActive(active);
  tmpTOT_Button.setOrder(order);
  tmpTOT_Button.setIdTOT_Page(new TOT_PageId(idTOT_Page));

    return tmpTOT_Button;
  }

}
