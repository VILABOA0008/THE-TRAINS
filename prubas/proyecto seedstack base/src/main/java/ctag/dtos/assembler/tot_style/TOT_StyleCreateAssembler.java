  package ctag.dtos.assembler.tot_style;

import org.seedstack.business.assembler.BaseAssembler;
public class Tot_styleCreateAssembler extends BaseAssembler<Tot_style, Tot_styleCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Tot_style sourceAggregate, Tot_styleCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setStyleClass(sourceAggregate.getStyleClass());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_styleCreateDto sourceDto,Tot_style targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setStyleClass(sourceDto.getStyleClass());

  }

}