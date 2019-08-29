  package ctag.dtos.assembler.processvigilance;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessVigilanceAssembler extends BaseAssembler<ProcessVigilance, ProcessVigilanceDto> {

  private final Assembler<ProcessVigilance, ProcessVigilanceCreateDto> assembler;

  @Inject
  public ProcessVigilanceAssembler(
      Assembler<ProcessVigilance, ProcessVigilanceCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessVigilance sourceAggregate, ProcessVigilanceDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessVigilance(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceDto sourceDto, ProcessVigilance targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
