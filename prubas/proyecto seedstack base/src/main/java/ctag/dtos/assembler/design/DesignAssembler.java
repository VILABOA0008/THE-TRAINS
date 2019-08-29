  package ctag.dtos.assembler.design;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class DesignAssembler extends BaseAssembler<Design, DesignDto> {

  private final Assembler<Design, DesignCreateDto> assembler;

  @Inject
  public DesignAssembler(
      Assembler<Design, DesignCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Design sourceAggregate, DesignDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdDesign(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(DesignDto sourceDto, Design targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
