  package ctag.dtos.assembler.tot_button;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class Tot_buttonAssembler extends BaseAssembler<Tot_button, Tot_buttonDto> {

  private final Assembler<Tot_button, Tot_buttonCreateDto> assembler;

  @Inject
  public Tot_buttonAssembler(
      Assembler<Tot_button, Tot_buttonCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Tot_button sourceAggregate, Tot_buttonDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTot_button(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_buttonDto sourceDto, Tot_button targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
