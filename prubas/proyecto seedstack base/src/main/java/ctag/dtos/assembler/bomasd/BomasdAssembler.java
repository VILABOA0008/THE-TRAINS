  package ctag.dtos.assembler.bomasd;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class BomasdAssembler extends BaseAssembler<Bomasd, BomasdDto> {

  private final Assembler<Bomasd, BomasdCreateDto> assembler;

  @Inject
  public BomasdAssembler(
      Assembler<Bomasd, BomasdCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Bomasd sourceAggregate, BomasdDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdBomasd(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(BomasdDto sourceDto, Bomasd targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
