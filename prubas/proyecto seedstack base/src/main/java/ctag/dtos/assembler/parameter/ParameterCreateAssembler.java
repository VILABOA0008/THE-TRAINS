  package ctag.dtos.assembler.parameter;

import org.seedstack.business.assembler.BaseAssembler;
public class ParameterCreateAssembler extends BaseAssembler<Parameter, ParameterCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Parameter sourceAggregate, ParameterCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setHasPoints(sourceAggregate.getHasPoints());
targetDto.setIdParameterType(sourceAggregate.getIdParameterType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ParameterCreateDto sourceDto,Parameter targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setHasPoints(sourceDto.getHasPoints());
targetAggregate.setIdParameterType(new ParameterTypeId(sourceDto.getIdParameterType()));

  }

}