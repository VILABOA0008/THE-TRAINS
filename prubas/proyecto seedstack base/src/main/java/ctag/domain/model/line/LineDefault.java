package ctag.application.factoryimpl.line;


import ctag.domain.model.line.*;

import org.seedstack.business.domain.BaseFactory; 

public class LineDefault extends BaseFactory<Line> implements LineFactory {

  @Override
  public Line createLine(String name,Integer idLineType) {

    Line tmpLine = create();


  tmpLine.setName(name);
  tmpLine.setIdLineType(new LineTypeId(idLineType));

    return tmpLine;
  }

}
