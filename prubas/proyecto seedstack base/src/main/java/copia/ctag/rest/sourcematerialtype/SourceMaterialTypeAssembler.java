  package ctag.dtos.assembler.sourcematerialtype;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.sourcematerialtype.SourceMaterialType;
public class SourceMaterialTypeAssembler extends BaseAssembler<SourceMaterialType, SourceMaterialTypeRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final SourceMaterialTypeRepresentation targetDto,SourceMaterialType sourceAggregate){

     targetDto.setIdSourceMaterialType(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void doMergeAggregateWithDto(final SourceMaterialType targetAggregate, final SourceMaterialTypeRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());

  }

}