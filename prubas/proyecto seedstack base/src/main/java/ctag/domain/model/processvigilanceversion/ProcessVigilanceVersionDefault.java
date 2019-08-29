package ctag.application.factoryimpl.processvigilanceversion;


import ctag.domain.model.processVigilanceVersion.*;

import org.seedstack.business.domain.BaseFactory; 

public class ProcessVigilanceVersionDefault extends BaseFactory<ProcessVigilanceVersion> implements ProcessVigilanceVersionFactory {

  @Override
  public ProcessVigilanceVersion createProcessVigilanceVersion(Integer revision,Integer creator,Integer lastModifier,Integer state,LocalDateTime activation,LocalDateTime deactivation,Integer idProcessVigilance,Integer idAccount,Integer idAccount) {

    ProcessVigilanceVersion tmpProcessVigilanceVersion = create();


  tmpProcessVigilanceVersion.setRevision(revision);
  tmpProcessVigilanceVersion.setCreator(creator);
  tmpProcessVigilanceVersion.setLastModifier(lastModifier);
  tmpProcessVigilanceVersion.setState(state);
  tmpProcessVigilanceVersion.setActivation(activation);
  tmpProcessVigilanceVersion.setDeactivation(deactivation);
  tmpProcessVigilanceVersion.setIdProcessVigilance(new ProcessVigilanceId(idProcessVigilance));
  tmpProcessVigilanceVersion.setIdAccount(new AccountId(idAccount));
  tmpProcessVigilanceVersion.setIdAccount(new AccountId(idAccount));

    return tmpProcessVigilanceVersion;
  }

}
