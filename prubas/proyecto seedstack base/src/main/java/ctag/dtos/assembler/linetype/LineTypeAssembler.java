  package ctag.dtos.assembler.linetype;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class LineTypeAssembler extends BaseAssembler<LineType, LineTypeDto> {

  private final Assembler<LineType, LineTypeCreateDto> assembler;

  @Inject
  public LineTypeAssembler(
      Assembler<LineType, LineTypeCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(LineType sourceAggregate, LineTypeDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdLineType(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LineTypeDto sourceDto, LineType targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
