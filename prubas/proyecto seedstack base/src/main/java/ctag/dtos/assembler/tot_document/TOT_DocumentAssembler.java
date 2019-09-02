  package ctag.dtos.assembler.tot_document;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class Tot_documentAssembler extends BaseAssembler<Tot_document, Tot_documentDto> {

  private final Assembler<Tot_document, Tot_documentCreateDto> assembler;

  @Inject
  public Tot_documentAssembler(
      Assembler<Tot_document, Tot_documentCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Tot_document sourceAggregate, Tot_documentDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTot_document(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_documentDto sourceDto, Tot_document targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
