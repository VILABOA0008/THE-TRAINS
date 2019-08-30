  package ctag.dtos.assembler.tot_style;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class TOT_StyleAssembler extends BaseAssembler<TOT_Style, TOT_StyleDto> {

  private final Assembler<TOT_Style, TOT_StyleCreateDto> assembler;

  @Inject
  public TOT_StyleAssembler(
      Assembler<TOT_Style, TOT_StyleCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(TOT_Style sourceAggregate, TOT_StyleDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTOT_Style(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_StyleDto sourceDto, TOT_Style targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
