  package ctag.dtos.assembler.coillaunch;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class CoilLaunchAssembler extends BaseAssembler<CoilLaunch, CoilLaunchDto> {

  private final Assembler<CoilLaunch, CoilLaunchCreateDto> assembler;

  @Inject
  public CoilLaunchAssembler(
      Assembler<CoilLaunch, CoilLaunchCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(CoilLaunch sourceAggregate, CoilLaunchDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdCoilLaunch(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(CoilLaunchDto sourceDto, CoilLaunch targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
