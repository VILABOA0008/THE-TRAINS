  package ctag.dtos.assembler.tot_doctype;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class TOT_DocTypeAssembler extends BaseAssembler<TOT_DocType, TOT_DocTypeDto> {

  private final Assembler<TOT_DocType, TOT_DocTypeCreateDto> assembler;

  @Inject
  public TOT_DocTypeAssembler(
      Assembler<TOT_DocType, TOT_DocTypeCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(TOT_DocType sourceAggregate, TOT_DocTypeDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTOT_DocType(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_DocTypeDto sourceDto, TOT_DocType targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
