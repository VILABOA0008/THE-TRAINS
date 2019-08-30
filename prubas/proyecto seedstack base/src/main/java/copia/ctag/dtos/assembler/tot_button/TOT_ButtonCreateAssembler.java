  package ctag.dtos.assembler.tot_button;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_ButtonCreateAssembler extends BaseAssembler<TOT_Button, TOT_ButtonCreateDto> {

  @Override
  public void mergeAggregateIntoDto(TOT_Button sourceAggregate, TOT_ButtonCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setShortName(sourceAggregate.getShortName());
targetDto.setX(sourceAggregate.getX());
targetDto.setY(sourceAggregate.getY());
targetDto.setW(sourceAggregate.getW());
targetDto.setH(sourceAggregate.getH());
targetDto.setActive(sourceAggregate.getActive());
targetDto.setOrder(sourceAggregate.getOrder());
targetDto.setIdTOT_Page(sourceAggregate.getIdTOT_Page().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_ButtonCreateDto sourceDto,TOT_Button targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setShortName(sourceDto.getShortName());
targetAggregate.setX(sourceDto.getX());
targetAggregate.setY(sourceDto.getY());
targetAggregate.setW(sourceDto.getW());
targetAggregate.setH(sourceDto.getH());
targetAggregate.setActive(sourceDto.getActive());
targetAggregate.setOrder(sourceDto.getOrder());
targetAggregate.setIdTOT_Page(new TOT_PageId(sourceDto.getIdTOT_Page()));

  }

}