  package ctag.dtos.assembler.tot_page;

import org.seedstack.business.assembler.BaseAssembler;
public class Tot_pageCreateAssembler extends BaseAssembler<Tot_page, Tot_pageCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Tot_page sourceAggregate, Tot_pageCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setOrder(sourceAggregate.getOrder());
targetDto.setActive(sourceAggregate.getActive());
targetDto.setRows(sourceAggregate.getRows());
targetDto.setIdLine(sourceAggregate.getIdLine().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_pageCreateDto sourceDto,Tot_page targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setOrder(sourceDto.getOrder());
targetAggregate.setActive(sourceDto.getActive());
targetAggregate.setRows(sourceDto.getRows());
targetAggregate.setIdLine(new LineId(sourceDto.getIdLine()));

  }

}