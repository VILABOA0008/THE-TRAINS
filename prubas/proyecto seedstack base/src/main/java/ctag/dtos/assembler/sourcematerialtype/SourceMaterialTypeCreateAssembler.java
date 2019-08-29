  package ctag.dtos.assembler.sourcematerialtype;

import org.seedstack.business.assembler.BaseAssembler;
public class SourceMaterialTypeCreateAssembler extends BaseAssembler<SourceMaterialType, SourceMaterialTypeCreateDto> {

  @Override
  public void mergeAggregateIntoDto(SourceMaterialType sourceAggregate, SourceMaterialTypeCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(SourceMaterialTypeCreateDto sourceDto,SourceMaterialType targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}