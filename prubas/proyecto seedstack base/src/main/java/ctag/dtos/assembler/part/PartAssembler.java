  package ctag.dtos.assembler.part;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class PartAssembler extends BaseAssembler<Part, PartDto> {

  private final Assembler<Part, PartCreateDto> assembler;

  @Inject
  public PartAssembler(
      Assembler<Part, PartCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Part sourceAggregate, PartDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdPart(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(PartDto sourceDto, Part targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
