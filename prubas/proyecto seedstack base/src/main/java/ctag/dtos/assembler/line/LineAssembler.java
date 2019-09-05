  package ctag.dtos.assembler.line;

import javax.inject.Inject;

import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

import ctag.dtos.dto.line.LineCreateDto;
import ctag.dtos.dto.line.LineDto;

public class LineAssembler extends BaseAssembler<Line, LineDto> {

  private final Assembler<Line, LineCreateDto> assembler;

  @Inject
  public LineAssembler(
      Assembler<Line, LineCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Line sourceAggregate, LineDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdLine(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LineDto sourceDto, Line targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
