package ctag.domain.model.reworkbatch;


public interface ReworkBatchFactory extends GenericFactory<ReworkBatch> {
  
 ReworkBatch createReworkBatch(LocalDate batchDate,LocalDate productionDate,String reworkerRef,Integer reworkedParts,Integer nokParts,Integer badSrcParts,Integer time,String comment,Integer idLine,Integer idPsaShift,Integer idPart);

 ReworkBatch createReworkBatch(Integer ReworkBatchId, LocalDate batchDate,LocalDate productionDate,String reworkerRef,Integer reworkedParts,Integer nokParts,Integer badSrcParts,Integer time,String comment,Integer idLine,Integer idPsaShift,Integer idPart);


}
