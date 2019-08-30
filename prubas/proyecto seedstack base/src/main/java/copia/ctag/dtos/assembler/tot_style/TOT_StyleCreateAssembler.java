  package ctag.dtos.assembler.tot_style;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_StyleCreateAssembler extends BaseAssembler<TOT_Style, TOT_StyleCreateDto> {

  @Override
  public void mergeAggregateIntoDto(TOT_Style sourceAggregate, TOT_StyleCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setStyleClass(sourceAggregate.getStyleClass());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_StyleCreateDto sourceDto,TOT_Style targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setStyleClass(sourceDto.getStyleClass());

  }

}