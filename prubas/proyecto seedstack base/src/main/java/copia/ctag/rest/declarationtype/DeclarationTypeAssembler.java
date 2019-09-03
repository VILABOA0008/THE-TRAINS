  package ctag.dtos.assembler.declarationtype;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.declarationtype.DeclarationType;
public class DeclarationTypeAssembler extends BaseAssembler<DeclarationType, DeclarationTypeRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final DeclarationTypeRepresentation targetDto,DeclarationType sourceAggregate){

     targetDto.setIdDeclarationType(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void doMergeAggregateWithDto(final DeclarationType targetAggregate, final DeclarationTypeRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());

  }

}