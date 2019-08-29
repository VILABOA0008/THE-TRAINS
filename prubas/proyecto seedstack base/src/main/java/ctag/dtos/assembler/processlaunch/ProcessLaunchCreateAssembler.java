  package ctag.dtos.assembler.processlaunch;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessLaunchCreateAssembler extends BaseAssembler<ProcessLaunch, ProcessLaunchCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessLaunch sourceAggregate, ProcessLaunchCreateDto targetDto) {
targetDto.setStamps(sourceAggregate.getStamps());
targetDto.setLaunchTime(sourceAggregate.getLaunchTime());
targetDto.setModifiesParameter(sourceAggregate.getModifiesParameter());
targetDto.setIdPsaShift(sourceAggregate.getIdPsaShift().getId());
targetDto.setIdProcessVigilanceVersion(sourceAggregate.getIdProcessVigilanceVersion().getId());
targetDto.setIdAccount(sourceAggregate.getIdAccount().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessLaunchCreateDto sourceDto,ProcessLaunch targetAggregate) {
targetAggregate.setStamps(sourceDto.getStamps());
targetAggregate.setLaunchTime(sourceDto.getLaunchTime());
targetAggregate.setModifiesParameter(sourceDto.getModifiesParameter());
targetAggregate.setIdPsaShift(new PsaShiftId(sourceDto.getIdPsaShift()));
targetAggregate.setIdProcessVigilanceVersion(new ProcessVigilanceVersionId(sourceDto.getIdProcessVigilanceVersion()));
targetAggregate.setIdAccount(new AccountId(sourceDto.getIdAccount()));

  }

}