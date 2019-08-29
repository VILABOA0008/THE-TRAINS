  package ctag.dtos.assembler.psashift;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class PsaShiftAssembler extends BaseAssembler<PsaShift, PsaShiftDto> {

  private final Assembler<PsaShift, PsaShiftCreateDto> assembler;

  @Inject
  public PsaShiftAssembler(
      Assembler<PsaShift, PsaShiftCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(PsaShift sourceAggregate, PsaShiftDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdPsaShift(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(PsaShiftDto sourceDto, PsaShift targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
