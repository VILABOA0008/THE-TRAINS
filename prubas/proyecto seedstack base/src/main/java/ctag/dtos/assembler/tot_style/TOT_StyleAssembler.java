  package ctag.dtos.assembler.tot_style;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class Tot_styleAssembler extends BaseAssembler<Tot_style, Tot_styleDto> {

  private final Assembler<Tot_style, Tot_styleCreateDto> assembler;

  @Inject
  public Tot_styleAssembler(
      Assembler<Tot_style, Tot_styleCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Tot_style sourceAggregate, Tot_styleDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTot_style(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_styleDto sourceDto, Tot_style targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
