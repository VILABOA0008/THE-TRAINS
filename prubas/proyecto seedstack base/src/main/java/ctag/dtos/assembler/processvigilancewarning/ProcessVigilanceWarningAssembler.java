  package ctag.dtos.assembler.processvigilancewarning;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessVigilanceWarningAssembler extends BaseAssembler<ProcessVigilanceWarning, ProcessVigilanceWarningDto> {

  private final Assembler<ProcessVigilanceWarning, ProcessVigilanceWarningCreateDto> assembler;

  @Inject
  public ProcessVigilanceWarningAssembler(
      Assembler<ProcessVigilanceWarning, ProcessVigilanceWarningCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceWarning sourceAggregate, ProcessVigilanceWarningDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessVigilanceWarning(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceWarningDto sourceDto, ProcessVigilanceWarning targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
