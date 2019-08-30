  package ctag.dtos.assembler.tot_button;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class TOT_ButtonAssembler extends BaseAssembler<TOT_Button, TOT_ButtonDto> {

  private final Assembler<TOT_Button, TOT_ButtonCreateDto> assembler;

  @Inject
  public TOT_ButtonAssembler(
      Assembler<TOT_Button, TOT_ButtonCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(TOT_Button sourceAggregate, TOT_ButtonDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTOT_Button(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_ButtonDto sourceDto, TOT_Button targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
