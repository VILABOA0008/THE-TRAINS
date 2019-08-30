  package ctag.dtos.assembler.tot_document;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class TOT_DocumentAssembler extends BaseAssembler<TOT_Document, TOT_DocumentDto> {

  private final Assembler<TOT_Document, TOT_DocumentCreateDto> assembler;

  @Inject
  public TOT_DocumentAssembler(
      Assembler<TOT_Document, TOT_DocumentCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(TOT_Document sourceAggregate, TOT_DocumentDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTOT_Document(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_DocumentDto sourceDto, TOT_Document targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
