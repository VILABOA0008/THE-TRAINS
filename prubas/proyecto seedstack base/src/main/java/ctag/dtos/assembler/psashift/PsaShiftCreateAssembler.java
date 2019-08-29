  package ctag.dtos.assembler.psashift;

import org.seedstack.business.assembler.BaseAssembler;
public class PsaShiftCreateAssembler extends BaseAssembler<PsaShift, PsaShiftCreateDto> {

  @Override
  public void mergeAggregateIntoDto(PsaShift sourceAggregate, PsaShiftCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setActive(sourceAggregate.getActive());
  }

  @Override
  public void mergeDtoIntoAggregate(PsaShiftCreateDto sourceDto,PsaShift targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setActive(sourceDto.getActive());

  }

}