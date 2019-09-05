  package ctag.dtos.assembler.line;

import org.seedstack.business.assembler.BaseAssembler;
public class LineCreateAssembler extends BaseAssembler<Line, LineCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Line sourceAggregate, LineCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setFK_Plant(sourceAggregate.getFK_Plant());
targetDto.setFK_Group(sourceAggregate.getFK_Group());
targetDto.setIdLineType(sourceAggregate.getIdLineType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LineCreateDto sourceDto,Line targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setFK_Plant(sourceDto.getFK_Plant());
targetAggregate.setFK_Group(sourceDto.getFK_Group());
targetAggregate.setIdLineType(new LineTypeId(sourceDto.getIdLineType()));

  }

}