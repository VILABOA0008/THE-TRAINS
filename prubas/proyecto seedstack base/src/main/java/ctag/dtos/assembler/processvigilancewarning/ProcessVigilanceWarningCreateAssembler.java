  package ctag.dtos.assembler.processvigilancewarning;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilanceWarningCreateAssembler extends BaseAssembler<ProcessVigilanceWarning, ProcessVigilanceWarningCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceWarning sourceAggregate, ProcessVigilanceWarningCreateDto targetDto) {
targetDto.setValidation(sourceAggregate.getValidation());
targetDto.setIdAccount(sourceAggregate.getIdAccount().getId());
targetDto.setIdProcessVigilanceVersionParameter(sourceAggregate.getIdProcessVigilanceVersionParameter().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceWarningCreateDto sourceDto,ProcessVigilanceWarning targetAggregate) {
targetAggregate.setValidation(sourceDto.getValidation());
targetAggregate.setIdAccount(new AccountId(sourceDto.getIdAccount()));
targetAggregate.setIdProcessVigilanceVersionParameter(new ProcessVigilanceVersionParameterId(sourceDto.getIdProcessVigilanceVersionParameter()));

  }

}