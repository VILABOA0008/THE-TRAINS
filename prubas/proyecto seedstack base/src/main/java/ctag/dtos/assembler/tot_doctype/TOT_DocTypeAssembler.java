  package ctag.dtos.assembler.tot_doctype;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class Tot_doctypeAssembler extends BaseAssembler<Tot_doctype, Tot_doctypeDto> {

  private final Assembler<Tot_doctype, Tot_doctypeCreateDto> assembler;

  @Inject
  public Tot_doctypeAssembler(
      Assembler<Tot_doctype, Tot_doctypeCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Tot_doctype sourceAggregate, Tot_doctypeDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTot_doctype(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_doctypeDto sourceDto, Tot_doctype targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
