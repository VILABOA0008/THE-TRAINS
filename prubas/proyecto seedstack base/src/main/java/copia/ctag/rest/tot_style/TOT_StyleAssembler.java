  package ctag.dtos.assembler.tot_style;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_StyleAssembler extends BaseAssembler<TOT_Style, TOT_StyleRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final TOT_StyleRepresentation targetDto,TOT_Style sourceAggregate){

     targetDto.setIdTOT_Style(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setStyleClass(sourceAggregate.getStyleClass());
  }

  @Override
  public void doMergeAggregateWithDto(final TOT_Style targetAggregate, final TOT_StyleRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setStyleClass(sourceDto.getStyleClass());

  }

}