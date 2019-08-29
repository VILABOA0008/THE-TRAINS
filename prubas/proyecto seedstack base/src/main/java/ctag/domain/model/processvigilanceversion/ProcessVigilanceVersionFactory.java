package ctag.domain.model.processvigilanceversion;


public interface ProcessVigilanceVersionFactory extends GenericFactory<ProcessVigilanceVersion> {
  
 ProcessVigilanceVersion createProcessVigilanceVersion(Integer revision,Integer creator,Integer lastModifier,Integer state,LocalDateTime activation,LocalDateTime deactivation,Integer idProcessVigilance,Integer idAccount,Integer idAccount);

 ProcessVigilanceVersion createProcessVigilanceVersion(Integer ProcessVigilanceVersionId, Integer revision,Integer creator,Integer lastModifier,Integer state,LocalDateTime activation,LocalDateTime deactivation,Integer idProcessVigilance,Integer idAccount,Integer idAccount);


}
