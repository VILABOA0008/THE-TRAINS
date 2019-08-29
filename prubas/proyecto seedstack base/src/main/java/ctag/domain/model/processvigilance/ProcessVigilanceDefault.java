package ctag.application.factoryimpl.processvigilance;


import ctag.domain.model.processVigilance.*;

import org.seedstack.business.domain.BaseFactory; 

public class ProcessVigilanceDefault extends BaseFactory<ProcessVigilance> implements ProcessVigilanceFactory {

  @Override
  public ProcessVigilance createProcessVigilance(String name,Integer cHR,String programNumber,Integer idBom,Integer idLine,Integer idProcessVigilanceState,Integer idSourceMaterialType) {

    ProcessVigilance tmpProcessVigilance = create();


  tmpProcessVigilance.setName(name);
  tmpProcessVigilance.setCHR(cHR);
  tmpProcessVigilance.setProgramNumber(programNumber);
  tmpProcessVigilance.setIdBom(new BomId(idBom));
  tmpProcessVigilance.setIdLine(new LineId(idLine));
  tmpProcessVigilance.setIdProcessVigilanceState(new ProcessVigilanceStateId(idProcessVigilanceState));
  tmpProcessVigilance.setIdSourceMaterialType(new SourceMaterialTypeId(idSourceMaterialType));

    return tmpProcessVigilance;
  }

}
