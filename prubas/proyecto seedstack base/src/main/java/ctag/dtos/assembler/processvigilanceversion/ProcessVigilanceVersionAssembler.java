  package ctag.dtos.assembler.processvigilanceversion;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessVigilanceVersionAssembler extends BaseAssembler<ProcessVigilanceVersion, ProcessVigilanceVersionDto> {

  private final Assembler<ProcessVigilanceVersion, ProcessVigilanceVersionCreateDto> assembler;

  @Inject
  public ProcessVigilanceVersionAssembler(
      Assembler<ProcessVigilanceVersion, ProcessVigilanceVersionCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceVersion sourceAggregate, ProcessVigilanceVersionDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessVigilanceVersion(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceVersionDto sourceDto, ProcessVigilanceVersion targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
