  package ctag.dtos.assembler.parametertype;

import org.seedstack.business.assembler.BaseAssembler;
public class ParameterTypeCreateAssembler extends BaseAssembler<ParameterType, ParameterTypeCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ParameterType sourceAggregate, ParameterTypeCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(ParameterTypeCreateDto sourceDto,ParameterType targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}