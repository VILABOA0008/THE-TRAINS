package ctag.application.factoryimpl.processvigilancewarning;


import ctag.domain.model.processVigilanceWarning.*;

import org.seedstack.business.domain.BaseFactory; 

public class ProcessVigilanceWarningDefault extends BaseFactory<ProcessVigilanceWarning> implements ProcessVigilanceWarningFactory {

  @Override
  public ProcessVigilanceWarning createProcessVigilanceWarning(LocalDateTime validation,Integer idAccount,Integer idProcessVigilanceVersionParameter) {

    ProcessVigilanceWarning tmpProcessVigilanceWarning = create();


  tmpProcessVigilanceWarning.setValidation(validation);
  tmpProcessVigilanceWarning.setIdAccount(new AccountId(idAccount));
  tmpProcessVigilanceWarning.setIdProcessVigilanceVersionParameter(new ProcessVigilanceVersionParameterId(idProcessVigilanceVersionParameter));

    return tmpProcessVigilanceWarning;
  }

}
