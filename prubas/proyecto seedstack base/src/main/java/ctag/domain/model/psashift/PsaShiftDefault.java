package ctag.application.factoryimpl.psashift;


import ctag.domain.model.psaShift.*;

import org.seedstack.business.domain.BaseFactory; 

public class PsaShiftDefault extends BaseFactory<PsaShift> implements PsaShiftFactory {

  @Override
  public PsaShift createPsaShift(String name,boolean active) {

    PsaShift tmpPsaShift = create();


  tmpPsaShift.setName(name);
  tmpPsaShift.setActive(active);

    return tmpPsaShift;
  }

}
