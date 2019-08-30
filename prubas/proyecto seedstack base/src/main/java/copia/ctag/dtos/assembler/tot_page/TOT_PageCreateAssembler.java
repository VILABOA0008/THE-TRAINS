  package ctag.dtos.assembler.tot_page;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_PageCreateAssembler extends BaseAssembler<TOT_Page, TOT_PageCreateDto> {

  @Override
  public void mergeAggregateIntoDto(TOT_Page sourceAggregate, TOT_PageCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setOrder(sourceAggregate.getOrder());
targetDto.setActive(sourceAggregate.getActive());
targetDto.setIdLine(sourceAggregate.getIdLine().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_PageCreateDto sourceDto,TOT_Page targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setOrder(sourceDto.getOrder());
targetAggregate.setActive(sourceDto.getActive());
targetAggregate.setIdLine(new LineId(sourceDto.getIdLine()));

  }

}