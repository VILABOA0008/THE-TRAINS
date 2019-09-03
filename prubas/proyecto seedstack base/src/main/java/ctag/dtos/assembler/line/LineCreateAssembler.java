  package ctag.dtos.assembler.line;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.linetype.LineTypeId;
import ctag.dtos.dto.line.LineCreateDto;
public class LineCreateAssembler extends BaseAssembler<Line, LineCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Line sourceAggregate, LineCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setPlant(sourceAggregate.getPlant());
targetDto.setGroup(sourceAggregate.getGroup());
targetDto.setIdLineType(sourceAggregate.getIdLineType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LineCreateDto sourceDto,Line targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setPlant(sourceDto.getPlant());
targetAggregate.setGroup(sourceDto.getGroup());
targetAggregate.setIdLineType(new LineTypeId(sourceDto.getIdLineType()));

  }

}