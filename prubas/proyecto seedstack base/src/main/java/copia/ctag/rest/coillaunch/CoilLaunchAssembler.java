  package ctag.dtos.assembler.coillaunch;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.coillaunch.CoilLaunch;
import ctag.domain.model.processlaunch.ProcessLaunchId;
public class CoilLaunchAssembler extends BaseAssembler<CoilLaunch, CoilLaunchRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final CoilLaunchRepresentation targetDto,CoilLaunch sourceAggregate){

     targetDto.setIdCoilLaunch(sourceAggregate.getEntityId().getId()); 
targetDto.setCoilNumber(sourceAggregate.getCoilNumber());
targetDto.setIdProcessLaunch(sourceAggregate.getIdProcessLaunch().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final CoilLaunch targetAggregate, final CoilLaunchRepresentation sourceDto){
targetAggregate.setCoilNumber(sourceDto.getCoilNumber());
targetAggregate.setIdProcessLaunch(new ProcessLaunchId(sourceDto.getIdProcessLaunch()));

  }

}