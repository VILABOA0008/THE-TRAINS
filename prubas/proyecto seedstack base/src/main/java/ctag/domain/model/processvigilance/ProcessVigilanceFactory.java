package ctag.domain.model.processvigilance;


public interface ProcessVigilanceFactory extends GenericFactory<ProcessVigilance> {
  
 ProcessVigilance createProcessVigilance(String name,Integer cHR,String programNumber,Integer idBom,Integer idLine,Integer idProcessVigilanceState,Integer idSourceMaterialType);

 ProcessVigilance createProcessVigilance(Integer ProcessVigilanceId, String name,Integer cHR,String programNumber,Integer idBom,Integer idLine,Integer idProcessVigilanceState,Integer idSourceMaterialType);


}
