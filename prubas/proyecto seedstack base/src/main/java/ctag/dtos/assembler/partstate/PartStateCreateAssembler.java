  package ctag.dtos.assembler.partstate;

import org.seedstack.business.assembler.BaseAssembler;
public class PartStateCreateAssembler extends BaseAssembler<PartState, PartStateCreateDto> {

  @Override
  public void mergeAggregateIntoDto(PartState sourceAggregate, PartStateCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(PartStateCreateDto sourceDto,PartState targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}