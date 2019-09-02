  package ctag.dtos.assembler.tot_page;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class Tot_pageAssembler extends BaseAssembler<Tot_page, Tot_pageDto> {

  private final Assembler<Tot_page, Tot_pageCreateDto> assembler;

  @Inject
  public Tot_pageAssembler(
      Assembler<Tot_page, Tot_pageCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Tot_page sourceAggregate, Tot_pageDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTot_page(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_pageDto sourceDto, Tot_page targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
