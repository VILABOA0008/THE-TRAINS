  package ctag.dtos.assembler.processvigilance2;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessVigilance2Assembler extends BaseAssembler<ProcessVigilance2, ProcessVigilance2Dto> {

  private final Assembler<ProcessVigilance2, ProcessVigilance2CreateDto> assembler;

  @Inject
  public ProcessVigilance2Assembler(
      Assembler<ProcessVigilance2, ProcessVigilance2CreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessVigilance2 sourceAggregate, ProcessVigilance2Dto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessVigilance2(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilance2Dto sourceDto, ProcessVigilance2 targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
