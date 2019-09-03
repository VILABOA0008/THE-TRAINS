  package ctag.dtos.assembler.processvigilancestate;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.processvigilancestate.ProcessVigilanceState;
public class ProcessVigilanceStateAssembler extends BaseAssembler<ProcessVigilanceState, ProcessVigilanceStateRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ProcessVigilanceStateRepresentation targetDto,ProcessVigilanceState sourceAggregate){

     targetDto.setIdProcessVigilanceState(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void doMergeAggregateWithDto(final ProcessVigilanceState targetAggregate, final ProcessVigilanceStateRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());

  }

}