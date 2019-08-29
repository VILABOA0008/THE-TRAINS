  package ctag.dtos.assembler.line;

import org.seedstack.business.assembler.BaseAssembler;
public class LineCreateAssembler extends BaseAssembler<Line, LineCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Line sourceAggregate, LineCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setIdLineType(sourceAggregate.getIdLineType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LineCreateDto sourceDto,Line targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setIdLineType(new LineTypeId(sourceDto.getIdLineType()));

  }

}