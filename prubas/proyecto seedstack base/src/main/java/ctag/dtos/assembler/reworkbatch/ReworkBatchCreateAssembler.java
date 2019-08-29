  package ctag.dtos.assembler.reworkbatch;

import org.seedstack.business.assembler.BaseAssembler;
public class ReworkBatchCreateAssembler extends BaseAssembler<ReworkBatch, ReworkBatchCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ReworkBatch sourceAggregate, ReworkBatchCreateDto targetDto) {
targetDto.setBatchDate(sourceAggregate.getBatchDate());
targetDto.setProductionDate(sourceAggregate.getProductionDate());
targetDto.setReworkerRef(sourceAggregate.getReworkerRef());
targetDto.setReworkedParts(sourceAggregate.getReworkedParts());
targetDto.setNokParts(sourceAggregate.getNokParts());
targetDto.setBadSrcParts(sourceAggregate.getBadSrcParts());
targetDto.setTime(sourceAggregate.getTime());
targetDto.setComment(sourceAggregate.getComment());
targetDto.setIdLine(sourceAggregate.getIdLine().getId());
targetDto.setIdPsaShift(sourceAggregate.getIdPsaShift().getId());
targetDto.setIdPart(sourceAggregate.getIdPart().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ReworkBatchCreateDto sourceDto,ReworkBatch targetAggregate) {
targetAggregate.setBatchDate(sourceDto.getBatchDate());
targetAggregate.setProductionDate(sourceDto.getProductionDate());
targetAggregate.setReworkerRef(sourceDto.getReworkerRef());
targetAggregate.setReworkedParts(sourceDto.getReworkedParts());
targetAggregate.setNokParts(sourceDto.getNokParts());
targetAggregate.setBadSrcParts(sourceDto.getBadSrcParts());
targetAggregate.setTime(sourceDto.getTime());
targetAggregate.setComment(sourceDto.getComment());
targetAggregate.setIdLine(new LineId(sourceDto.getIdLine()));
targetAggregate.setIdPsaShift(new PsaShiftId(sourceDto.getIdPsaShift()));
targetAggregate.setIdPart(new PartId(sourceDto.getIdPart()));

  }

}