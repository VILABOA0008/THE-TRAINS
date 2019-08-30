  package ctag.dtos.assembler.processvigilancewarning;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilanceWarningAssembler extends BaseAssembler<ProcessVigilanceWarning, ProcessVigilanceWarningRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ProcessVigilanceWarningRepresentation targetDto,ProcessVigilanceWarning sourceAggregate){

     targetDto.setIdProcessVigilanceWarning(sourceAggregate.getEntityId().getId()); 
targetDto.setValidation(sourceAggregate.getValidation());
targetDto.setIdAccount(sourceAggregate.getIdAccount().getId());
targetDto.setIdProcessVigilanceVersionParameter(sourceAggregate.getIdProcessVigilanceVersionParameter().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final ProcessVigilanceWarning targetAggregate, final ProcessVigilanceWarningRepresentation sourceDto){
targetAggregate.setValidation(sourceDto.getValidation());
targetAggregate.setIdAccount(new AccountId(sourceDto.getIdAccount()));
targetAggregate.setIdProcessVigilanceVersionParameter(new ProcessVigilanceVersionParameterId(sourceDto.getIdProcessVigilanceVersionParameter()));

  }

}