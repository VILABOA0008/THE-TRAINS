package ctag.application.factoryimpl.tot_page;


import ctag.domain.model.tOT_Page.*;

import org.seedstack.business.domain.BaseFactory; 

public class TOT_PageFactoryImpl extends BaseFactory<TOT_Page> implements TOT_PageFactory {

  @Override
  public TOT_Page createTOT_Page(String name,Integer order,boolean active,Integer idLine) {

    TOT_Page tmpTOT_Page = create();


  tmpTOT_Page.setName(name);
  tmpTOT_Page.setOrder(order);
  tmpTOT_Page.setActive(active);
  tmpTOT_Page.setIdLine(new LineId(idLine));

    return tmpTOT_Page;
  }

}
