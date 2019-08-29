  package ctag.dtos.assembler.parameter;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ParameterAssembler extends BaseAssembler<Parameter, ParameterDto> {

  private final Assembler<Parameter, ParameterCreateDto> assembler;

  @Inject
  public ParameterAssembler(
      Assembler<Parameter, ParameterCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Parameter sourceAggregate, ParameterDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdParameter(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ParameterDto sourceDto, Parameter targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
