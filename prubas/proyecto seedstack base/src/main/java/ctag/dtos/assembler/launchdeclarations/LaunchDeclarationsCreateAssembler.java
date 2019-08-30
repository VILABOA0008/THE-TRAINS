  package ctag.dtos.assembler.launchdeclarations;

import org.seedstack.business.assembler.BaseAssembler;
public class LaunchDeclarationsCreateAssembler extends BaseAssembler<LaunchDeclarations, LaunchDeclarationsCreateDto> {

  @Override
  public void mergeAggregateIntoDto(LaunchDeclarations sourceAggregate, LaunchDeclarationsCreateDto targetDto) {
targetDto.setIdDeclarationType(sourceAggregate.getIdDeclarationType());
targetDto.setQuantity(sourceAggregate.getQuantity());
targetDto.setIdDeclarationType(sourceAggregate.getIdDeclarationType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LaunchDeclarationsCreateDto sourceDto,LaunchDeclarations targetAggregate) {
targetAggregate.setIdDeclarationType(sourceDto.getIdDeclarationType());
targetAggregate.setQuantity(sourceDto.getQuantity());
targetAggregate.setIdDeclarationType(new DeclarationTypeId(sourceDto.getIdDeclarationType()));

  }

}