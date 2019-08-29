package ctag.application.factoryimpl.linetype;


import ctag.domain.model.lineType.*;

import org.seedstack.business.domain.BaseFactory; 

public class LineTypeDefault extends BaseFactory<LineType> implements LineTypeFactory {

  @Override
  public LineType createLineType(String name,boolean active) {

    LineType tmpLineType = create();


  tmpLineType.setName(name);
  tmpLineType.setActive(active);

    return tmpLineType;
  }

}
