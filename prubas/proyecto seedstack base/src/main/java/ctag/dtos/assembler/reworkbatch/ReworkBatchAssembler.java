  package ctag.dtos.assembler.reworkbatch;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ReworkBatchAssembler extends BaseAssembler<ReworkBatch, ReworkBatchDto> {

  private final Assembler<ReworkBatch, ReworkBatchCreateDto> assembler;

  @Inject
  public ReworkBatchAssembler(
      Assembler<ReworkBatch, ReworkBatchCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ReworkBatch sourceAggregate, ReworkBatchDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdReworkBatch(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ReworkBatchDto sourceDto, ReworkBatch targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
