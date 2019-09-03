  package ctag.dtos.assembler.parameter;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.parametertype.ParameterTypeId;
public class ParameterAssembler extends BaseAssembler<Parameter, ParameterRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ParameterRepresentation targetDto,Parameter sourceAggregate){

     targetDto.setIdParameter(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setHasPoints(sourceAggregate.getHasPoints());
targetDto.setIdParameterType(sourceAggregate.getIdParameterType().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final Parameter targetAggregate, final ParameterRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setHasPoints(sourceDto.getHasPoints());
targetAggregate.setIdParameterType(new ParameterTypeId(sourceDto.getIdParameterType()));

  }

}