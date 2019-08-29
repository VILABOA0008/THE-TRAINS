  package ctag.dtos.assembler.processvigilanceversionparameter;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ProcessVigilanceVersionParameterAssembler extends BaseAssembler<ProcessVigilanceVersionParameter, ProcessVigilanceVersionParameterDto> {

  private final Assembler<ProcessVigilanceVersionParameter, ProcessVigilanceVersionParameterCreateDto> assembler;

  @Inject
  public ProcessVigilanceVersionParameterAssembler(
      Assembler<ProcessVigilanceVersionParameter, ProcessVigilanceVersionParameterCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceVersionParameter sourceAggregate, ProcessVigilanceVersionParameterDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdProcessVigilanceVersionParameter(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceVersionParameterDto sourceDto, ProcessVigilanceVersionParameter targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
