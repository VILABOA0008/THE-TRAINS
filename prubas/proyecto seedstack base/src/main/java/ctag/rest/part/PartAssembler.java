  package ctag.dtos.assembler.part;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.design.DesignId;
public class PartAssembler extends BaseAssembler<Part, PartRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final PartRepresentation targetDto,Part sourceAggregate){

     targetDto.setIdPart(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setIdDesign(sourceAggregate.getIdDesign().getId());
targetDto.setIdPartState(sourceAggregate.getIdPartState().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final Part targetAggregate, final PartRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setIdDesign(new DesignId(sourceDto.getIdDesign()));
targetAggregate.setIdPartState(new PartStateId(sourceDto.getIdPartState()));

  }

}