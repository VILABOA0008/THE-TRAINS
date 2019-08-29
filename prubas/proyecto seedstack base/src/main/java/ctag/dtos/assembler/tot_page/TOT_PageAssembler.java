  package ctag.dtos.assembler.tot_page;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class TOT_PageAssembler extends BaseAssembler<TOT_Page, TOT_PageDto> {

  private final Assembler<TOT_Page, TOT_PageCreateDto> assembler;

  @Inject
  public TOT_PageAssembler(
      Assembler<TOT_Page, TOT_PageCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(TOT_Page sourceAggregate, TOT_PageDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTOT_Page(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_PageDto sourceDto, TOT_Page targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
