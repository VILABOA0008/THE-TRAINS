  package ctag.dtos.assembler.declarationtype;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class DeclarationTypeAssembler extends BaseAssembler<DeclarationType, DeclarationTypeDto> {

  private final Assembler<DeclarationType, DeclarationTypeCreateDto> assembler;

  @Inject
  public DeclarationTypeAssembler(
      Assembler<DeclarationType, DeclarationTypeCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(DeclarationType sourceAggregate, DeclarationTypeDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdDeclarationType(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(DeclarationTypeDto sourceDto, DeclarationType targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
