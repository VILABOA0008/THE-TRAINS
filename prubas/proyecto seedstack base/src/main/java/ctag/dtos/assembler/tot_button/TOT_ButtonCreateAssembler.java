  package ctag.dtos.assembler.tot_button;

import org.seedstack.business.assembler.BaseAssembler;
public class Tot_buttonCreateAssembler extends BaseAssembler<Tot_button, Tot_buttonCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Tot_button sourceAggregate, Tot_buttonCreateDto targetDto) {
targetDto.setShortName(sourceAggregate.getShortName());
targetDto.setOrder(sourceAggregate.getOrder());
targetDto.setName(sourceAggregate.getName());
targetDto.setX(sourceAggregate.getX());
targetDto.setY(sourceAggregate.getY());
targetDto.setW(sourceAggregate.getW());
targetDto.setH(sourceAggregate.getH());
targetDto.setActive(sourceAggregate.getActive());
targetDto.setIdTOT_Page(sourceAggregate.getIdTOT_Page().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_buttonCreateDto sourceDto,Tot_button targetAggregate) {
targetAggregate.setShortName(sourceDto.getShortName());
targetAggregate.setOrder(sourceDto.getOrder());
targetAggregate.setName(sourceDto.getName());
targetAggregate.setX(sourceDto.getX());
targetAggregate.setY(sourceDto.getY());
targetAggregate.setW(sourceDto.getW());
targetAggregate.setH(sourceDto.getH());
targetAggregate.setActive(sourceDto.getActive());
targetAggregate.setIdTOT_Page(new TOT_PageId(sourceDto.getIdTOT_Page()));

  }

}