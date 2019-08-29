  package ctag.dtos.assembler.processvigilanceversion;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilanceVersionCreateAssembler extends BaseAssembler<ProcessVigilanceVersion, ProcessVigilanceVersionCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceVersion sourceAggregate, ProcessVigilanceVersionCreateDto targetDto) {
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
  public void mergeDtoIntoAggregate(ProcessVigilanceVersionCreateDto sourceDto,ProcessVigilanceVersion targetAggregate) {
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