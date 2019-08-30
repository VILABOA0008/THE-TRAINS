  package ctag.dtos.assembler.parametertype;

import org.seedstack.business.assembler.BaseAssembler;
public class ParameterTypeAssembler extends BaseAssembler<ParameterType, ParameterTypeRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ParameterTypeRepresentation targetDto,ParameterType sourceAggregate){

     targetDto.setIdParameterType(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void doMergeAggregateWithDto(final ParameterType targetAggregate, final ParameterTypeRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());

  }

}