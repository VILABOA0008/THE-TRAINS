  package ctag.dtos.assembler.linetype;

import org.seedstack.business.assembler.BaseAssembler;
public class LineTypeCreateAssembler extends BaseAssembler<LineType, LineTypeCreateDto> {

  @Override
  public void mergeAggregateIntoDto(LineType sourceAggregate, LineTypeCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setActive(sourceAggregate.getActive());
  }

  @Override
  public void mergeDtoIntoAggregate(LineTypeCreateDto sourceDto,LineType targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setActive(sourceDto.getActive());

  }

}