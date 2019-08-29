package ctag.application.factoryimpl.processlaunch;


import ctag.domain.model.processLaunch.*;

import org.seedstack.business.domain.BaseFactory; 

public class ProcessLaunchDefault extends BaseFactory<ProcessLaunch> implements ProcessLaunchFactory {

  @Override
  public ProcessLaunch createProcessLaunch(Integer stamps,LocalDateTime launchTime,boolean modifiesParameter,Integer idPsaShift,Integer idProcessVigilanceVersion,Integer idAccount) {

    ProcessLaunch tmpProcessLaunch = create();


  tmpProcessLaunch.setStamps(stamps);
  tmpProcessLaunch.setLaunchTime(launchTime);
  tmpProcessLaunch.setModifiesParameter(modifiesParameter);
  tmpProcessLaunch.setIdPsaShift(new PsaShiftId(idPsaShift));
  tmpProcessLaunch.setIdProcessVigilanceVersion(new ProcessVigilanceVersionId(idProcessVigilanceVersion));
  tmpProcessLaunch.setIdAccount(new AccountId(idAccount));

    return tmpProcessLaunch;
  }

}
