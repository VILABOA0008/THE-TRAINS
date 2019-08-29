package ctag.domain.model.processvigilancewarning;


public interface ProcessVigilanceWarningFactory extends GenericFactory<ProcessVigilanceWarning> {
  
 ProcessVigilanceWarning createProcessVigilanceWarning(LocalDateTime validation,Integer idAccount,Integer idProcessVigilanceVersionParameter);

 ProcessVigilanceWarning createProcessVigilanceWarning(Integer ProcessVigilanceWarningId, LocalDateTime validation,Integer idAccount,Integer idProcessVigilanceVersionParameter);


}
