  package ctag.dtos.assembler.part;

import org.seedstack.business.assembler.BaseAssembler;
public class PartCreateAssembler extends BaseAssembler<Part, PartCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Part sourceAggregate, PartCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setIdDesign(sourceAggregate.getIdDesign().getId());
targetDto.setIdPartState(sourceAggregate.getIdPartState().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(PartCreateDto sourceDto,Part targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setIdDesign(new DesignId(sourceDto.getIdDesign()));
targetAggregate.setIdPartState(new PartStateId(sourceDto.getIdPartState()));

  }

}