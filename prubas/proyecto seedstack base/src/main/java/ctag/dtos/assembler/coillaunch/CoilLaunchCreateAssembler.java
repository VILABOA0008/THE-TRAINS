  package ctag.dtos.assembler.coillaunch;

import org.seedstack.business.assembler.BaseAssembler;
public class CoilLaunchCreateAssembler extends BaseAssembler<CoilLaunch, CoilLaunchCreateDto> {

  @Override
  public void mergeAggregateIntoDto(CoilLaunch sourceAggregate, CoilLaunchCreateDto targetDto) {
targetDto.setCoilNumber(sourceAggregate.getCoilNumber());
targetDto.setIdProcessLaunch(sourceAggregate.getIdProcessLaunch().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(CoilLaunchCreateDto sourceDto,CoilLaunch targetAggregate) {
targetAggregate.setCoilNumber(sourceDto.getCoilNumber());
targetAggregate.setIdProcessLaunch(new ProcessLaunchId(sourceDto.getIdProcessLaunch()));

  }

}