package ctag.application.factoryimpl.linetype;


import ctag.domain.model.lineType.*;

import org.seedstack.business.domain.BaseFactory; 

public class LineTypeFactoryImpl extends BaseFactory<LineType> implements LineTypeFactory {

  @Override
  public LineType createLineType(String name,boolean active) {

    LineType tmpLineType = create();


  tmpLineType.setName(name);
  tmpLineType.setActive(active);

    return tmpLineType;
  }

}
