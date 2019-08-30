  package ctag.dtos.assembler.launchdeclarations;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class LaunchDeclarationsAssembler extends BaseAssembler<LaunchDeclarations, LaunchDeclarationsDto> {

  private final Assembler<LaunchDeclarations, LaunchDeclarationsCreateDto> assembler;

  @Inject
  public LaunchDeclarationsAssembler(
      Assembler<LaunchDeclarations, LaunchDeclarationsCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(LaunchDeclarations sourceAggregate, LaunchDeclarationsDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdLaunchDeclarations(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LaunchDeclarationsDto sourceDto, LaunchDeclarations targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
