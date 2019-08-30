package ctag.application.factoryimpl.line;


import ctag.domain.model.line.*;

import org.seedstack.business.domain.BaseFactory; 

public class LineFactoryImpl extends BaseFactory<Line> implements LineFactory {

  @Override
  public Line createLine(String name,boolean active) {

    Line tmpLine = create();


  tmpLine.setName(name);
  tmpLine.setActive(active);

    return tmpLine;
  }

}
