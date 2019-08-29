  package ctag.dtos.assembler.declarationtype;

import org.seedstack.business.assembler.BaseAssembler;
public class DeclarationTypeCreateAssembler extends BaseAssembler<DeclarationType, DeclarationTypeCreateDto> {

  @Override
  public void mergeAggregateIntoDto(DeclarationType sourceAggregate, DeclarationTypeCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(DeclarationTypeCreateDto sourceDto,DeclarationType targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}