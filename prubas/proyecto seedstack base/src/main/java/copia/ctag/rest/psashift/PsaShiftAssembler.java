  package ctag.dtos.assembler.psashift;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.psashift.PsaShift;
public class PsaShiftAssembler extends BaseAssembler<PsaShift, PsaShiftRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final PsaShiftRepresentation targetDto,PsaShift sourceAggregate){

     targetDto.setIdPsaShift(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setActive(sourceAggregate.getActive());
  }

  @Override
  public void doMergeAggregateWithDto(final PsaShift targetAggregate, final PsaShiftRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setActive(sourceDto.getActive());

  }

}