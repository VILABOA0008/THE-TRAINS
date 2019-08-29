  package ctag.dtos.assembler.processlaunch;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessLaunchAssembler extends BaseAssembler<ProcessLaunch, ProcessLaunchDto> {

  private final Assembler<ProcessLaunch, ProcessLaunchCreateDto> assembler;

  @Inject
  public ProcessLaunchAssembler(
      Assembler<ProcessLaunch, ProcessLaunchCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessLaunch sourceAggregate, ProcessLaunchDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessLaunch(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessLaunchDto sourceDto, ProcessLaunch targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
