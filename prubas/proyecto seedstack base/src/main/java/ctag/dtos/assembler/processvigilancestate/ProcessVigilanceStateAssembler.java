  package ctag.dtos.assembler.processvigilancestate;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessVigilanceStateAssembler extends BaseAssembler<ProcessVigilanceState, ProcessVigilanceStateDto> {

  private final Assembler<ProcessVigilanceState, ProcessVigilanceStateCreateDto> assembler;

  @Inject
  public ProcessVigilanceStateAssembler(
      Assembler<ProcessVigilanceState, ProcessVigilanceStateCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceState sourceAggregate, ProcessVigilanceStateDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessVigilanceState(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceStateDto sourceDto, ProcessVigilanceState targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
