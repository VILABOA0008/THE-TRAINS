  package ctag.dtos.assembler.parametertype;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class ParameterTypeAssembler extends BaseAssembler<ParameterType, ParameterTypeDto> {

  private final Assembler<ParameterType, ParameterTypeCreateDto> assembler;

  @Inject
  public ParameterTypeAssembler(
      Assembler<ParameterType, ParameterTypeCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(ParameterType sourceAggregate, ParameterTypeDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdParameterType(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ParameterTypeDto sourceDto, ParameterType targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
