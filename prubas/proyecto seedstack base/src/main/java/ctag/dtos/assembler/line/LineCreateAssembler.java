  package ctag.dtos.assembler.line;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.dtos.dto.line.LineCreateDto;
public class LineCreateAssembler extends BaseAssembler<Line, LineCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Line sourceAggregate, LineCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setActive(sourceAggregate.getActive());
  }

  @Override
  public void mergeDtoIntoAggregate(LineCreateDto sourceDto,Line targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setActive(sourceDto.getActive());

  }

}