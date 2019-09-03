  package ctag.dtos.assembler.processlaunch;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.account.AccountId;
import ctag.domain.model.processlaunch.ProcessLaunch;
import ctag.domain.model.processvigilanceversion.ProcessVigilanceVersionId;
import ctag.domain.model.psashift.PsaShiftId;
public class ProcessLaunchAssembler extends BaseAssembler<ProcessLaunch, ProcessLaunchRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ProcessLaunchRepresentation targetDto,ProcessLaunch sourceAggregate){

     targetDto.setIdProcessLaunch(sourceAggregate.getEntityId().getId()); 
targetDto.setStamps(sourceAggregate.getStamps());
targetDto.setLaunchTime(sourceAggregate.getLaunchTime());
targetDto.setModifiesParameter(sourceAggregate.getModifiesParameter());
targetDto.setIdPsaShift(sourceAggregate.getIdPsaShift().getId());
targetDto.setIdProcessVigilanceVersion(sourceAggregate.getIdProcessVigilanceVersion().getId());
targetDto.setIdAccount(sourceAggregate.getIdAccount().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final ProcessLaunch targetAggregate, final ProcessLaunchRepresentation sourceDto){
targetAggregate.setStamps(sourceDto.getStamps());
targetAggregate.setLaunchTime(sourceDto.getLaunchTime());
targetAggregate.setModifiesParameter(sourceDto.getModifiesParameter());
targetAggregate.setIdPsaShift(new PsaShiftId(sourceDto.getIdPsaShift()));
targetAggregate.setIdProcessVigilanceVersion(new ProcessVigilanceVersionId(sourceDto.getIdProcessVigilanceVersion()));
targetAggregate.setIdAccount(new AccountId(sourceDto.getIdAccount()));

  }

}