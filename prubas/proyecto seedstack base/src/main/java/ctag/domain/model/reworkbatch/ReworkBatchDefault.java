package ctag.application.factoryimpl.reworkbatch;


import ctag.domain.model.reworkBatch.*;

import org.seedstack.business.domain.BaseFactory; 

public class ReworkBatchDefault extends BaseFactory<ReworkBatch> implements ReworkBatchFactory {

  @Override
  public ReworkBatch createReworkBatch(LocalDate batchDate,LocalDate productionDate,String reworkerRef,Integer reworkedParts,Integer nokParts,Integer badSrcParts,Integer time,String comment,Integer idLine,Integer idPsaShift,Integer idPart) {

    ReworkBatch tmpReworkBatch = create();


  tmpReworkBatch.setBatchDate(batchDate);
  tmpReworkBatch.setProductionDate(productionDate);
  tmpReworkBatch.setReworkerRef(reworkerRef);
  tmpReworkBatch.setReworkedParts(reworkedParts);
  tmpReworkBatch.setNokParts(nokParts);
  tmpReworkBatch.setBadSrcParts(badSrcParts);
  tmpReworkBatch.setTime(time);
  tmpReworkBatch.setComment(comment);
  tmpReworkBatch.setIdLine(new LineId(idLine));
  tmpReworkBatch.setIdPsaShift(new PsaShiftId(idPsaShift));
  tmpReworkBatch.setIdPart(new PartId(idPart));

    return tmpReworkBatch;
  }

}
