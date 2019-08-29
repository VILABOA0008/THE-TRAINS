  package ctag.dtos.assembler.launchmodifiedparameter;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class LaunchModifiedParameterAssembler extends BaseAssembler<LaunchModifiedParameter, LaunchModifiedParameterDto> {

  private final Assembler<LaunchModifiedParameter, LaunchModifiedParameterCreateDto> assembler;

  @Inject
  public LaunchModifiedParameterAssembler(
      Assembler<LaunchModifiedParameter, LaunchModifiedParameterCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(LaunchModifiedParameter sourceAggregate, LaunchModifiedParameterDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdLaunchModifiedParameter(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LaunchModifiedParameterDto sourceDto, LaunchModifiedParameter targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
