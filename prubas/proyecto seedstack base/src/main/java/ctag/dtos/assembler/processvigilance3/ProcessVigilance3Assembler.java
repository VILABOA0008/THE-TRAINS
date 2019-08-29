  package ctag.dtos.assembler.processvigilance3;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessVigilance3Assembler extends BaseAssembler<ProcessVigilance3, ProcessVigilance3Dto> {

  private final Assembler<ProcessVigilance3, ProcessVigilance3CreateDto> assembler;

  @Inject
  public ProcessVigilance3Assembler(
      Assembler<ProcessVigilance3, ProcessVigilance3CreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessVigilance3 sourceAggregate, ProcessVigilance3Dto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessVigilance3(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilance3Dto sourceDto, ProcessVigilance3 targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
