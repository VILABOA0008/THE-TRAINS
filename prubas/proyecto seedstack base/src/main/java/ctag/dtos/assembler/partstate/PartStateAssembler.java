  package ctag.dtos.assembler.partstate;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class PartStateAssembler extends BaseAssembler<PartState, PartStateDto> {

  private final Assembler<PartState, PartStateCreateDto> assembler;

  @Inject
  public PartStateAssembler(
      Assembler<PartState, PartStateCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(PartState sourceAggregate, PartStateDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdPartState(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(PartStateDto sourceDto, PartState targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
