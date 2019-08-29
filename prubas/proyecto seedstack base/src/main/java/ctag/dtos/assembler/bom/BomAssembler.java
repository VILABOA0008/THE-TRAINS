  package ctag.dtos.assembler.bom;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class BomAssembler extends BaseAssembler<Bom, BomDto> {

  private final Assembler<Bom, BomCreateDto> assembler;

  @Inject
  public BomAssembler(
      Assembler<Bom, BomCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Bom sourceAggregate, BomDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdBom(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(BomDto sourceDto, Bom targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
