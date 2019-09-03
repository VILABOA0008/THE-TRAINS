  package ctag.dtos.assembler.launchdeclarations;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.declarationtype.DeclarationTypeId;
import ctag.domain.model.launchdeclarations.LaunchDeclarations;
public class LaunchDeclarationsAssembler extends BaseAssembler<LaunchDeclarations, LaunchDeclarationsRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final LaunchDeclarationsRepresentation targetDto,LaunchDeclarations sourceAggregate){

     targetDto.setIdLaunchDeclarations(sourceAggregate.getEntityId().getId()); 
targetDto.setIdDeclarationType(sourceAggregate.getIdDeclarationType());
targetDto.setQuantity(sourceAggregate.getQuantity());
targetDto.setIdDeclarationType(sourceAggregate.getIdDeclarationType().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final LaunchDeclarations targetAggregate, final LaunchDeclarationsRepresentation sourceDto){
targetAggregate.setIdDeclarationType(sourceDto.getIdDeclarationType());
targetAggregate.setQuantity(sourceDto.getQuantity());
targetAggregate.setIdDeclarationType(new DeclarationTypeId(sourceDto.getIdDeclarationType()));

  }

}