  package ctag.dtos.assembler.sourcematerialtype;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class SourceMaterialTypeAssembler extends BaseAssembler<SourceMaterialType, SourceMaterialTypeDto> {

  private final Assembler<SourceMaterialType, SourceMaterialTypeCreateDto> assembler;

  @Inject
  public SourceMaterialTypeAssembler(
      Assembler<SourceMaterialType, SourceMaterialTypeCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(SourceMaterialType sourceAggregate, SourceMaterialTypeDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdSourceMaterialType(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(SourceMaterialTypeDto sourceDto, SourceMaterialType targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
