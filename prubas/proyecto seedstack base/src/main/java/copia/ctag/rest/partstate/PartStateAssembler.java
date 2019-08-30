  package ctag.dtos.assembler.partstate;

import org.seedstack.business.assembler.BaseAssembler;
public class PartStateAssembler extends BaseAssembler<PartState, PartStateRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final PartStateRepresentation targetDto,PartState sourceAggregate){

     targetDto.setIdPartState(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void doMergeAggregateWithDto(final PartState targetAggregate, final PartStateRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());

  }

}