  package ctag.dtos.assembler.processvigilanceversion;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.account.AccountId;
import ctag.domain.model.processvigilance.ProcessVigilanceId;
import ctag.domain.model.processvigilanceversion.ProcessVigilanceVersion;
public class ProcessVigilanceVersionAssembler extends BaseAssembler<ProcessVigilanceVersion, ProcessVigilanceVersionRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ProcessVigilanceVersionRepresentation targetDto,ProcessVigilanceVersion sourceAggregate){

     targetDto.setIdProcessVigilanceVersion(sourceAggregate.getEntityId().getId()); 
targetDto.setRevision(sourceAggregate.getRevision());
targetDto.setCreator(sourceAggregate.getCreator());
targetDto.setLastModifier(sourceAggregate.getLastModifier());
targetDto.setState(sourceAggregate.getState());
targetDto.setActivation(sourceAggregate.getActivation());
targetDto.setDeactivation(sourceAggregate.getDeactivation());
targetDto.setIdProcessVigilance(sourceAggregate.getIdProcessVigilance().getId());
targetDto.setIdAccount(sourceAggregate.getIdAccount().getId());
targetDto.setIdAccount(sourceAggregate.getIdAccount().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final ProcessVigilanceVersion targetAggregate, final ProcessVigilanceVersionRepresentation sourceDto){
targetAggregate.setRevision(sourceDto.getRevision());
targetAggregate.setCreator(sourceDto.getCreator());
targetAggregate.setLastModifier(sourceDto.getLastModifier());
targetAggregate.setState(sourceDto.getState());
targetAggregate.setActivation(sourceDto.getActivation());
targetAggregate.setDeactivation(sourceDto.getDeactivation());
targetAggregate.setIdProcessVigilance(new ProcessVigilanceId(sourceDto.getIdProcessVigilance()));
targetAggregate.setIdAccount(new AccountId(sourceDto.getIdAccount()));
targetAggregate.setIdAccount(new AccountId(sourceDto.getIdAccount()));

  }

}