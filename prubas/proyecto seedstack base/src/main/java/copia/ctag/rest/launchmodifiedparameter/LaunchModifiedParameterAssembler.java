  package ctag.dtos.assembler.launchmodifiedparameter;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.launchmodifiedparameter.LaunchModifiedParameter;
import ctag.domain.model.processlaunch.ProcessLaunchId;
import ctag.domain.model.processvigilanceversionparameter.ProcessVigilanceVersionParameterId;
public class LaunchModifiedParameterAssembler extends BaseAssembler<LaunchModifiedParameter, LaunchModifiedParameterRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final LaunchModifiedParameterRepresentation targetDto,LaunchModifiedParameter sourceAggregate){

     targetDto.setIdLaunchModifiedParameter(sourceAggregate.getEntityId().getId()); 
targetDto.setIdConfiguredParameter(sourceAggregate.getIdConfiguredParameter());
targetDto.setIdLaunch(sourceAggregate.getIdLaunch());
targetDto.setValue(sourceAggregate.getValue());
targetDto.setBooleanValue(sourceAggregate.getBooleanValue());
targetDto.setComment(sourceAggregate.getComment());
targetDto.setIdProcessVigilanceVersionParameter(sourceAggregate.getIdProcessVigilanceVersionParameter().getId());
targetDto.setIdProcessLaunch(sourceAggregate.getIdProcessLaunch().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final LaunchModifiedParameter targetAggregate, final LaunchModifiedParameterRepresentation sourceDto){
targetAggregate.setIdConfiguredParameter(sourceDto.getIdConfiguredParameter());
targetAggregate.setIdLaunch(sourceDto.getIdLaunch());
targetAggregate.setValue(sourceDto.getValue());
targetAggregate.setBooleanValue(sourceDto.getBooleanValue());
targetAggregate.setComment(sourceDto.getComment());
targetAggregate.setIdProcessVigilanceVersionParameter(new ProcessVigilanceVersionParameterId(sourceDto.getIdProcessVigilanceVersionParameter()));
targetAggregate.setIdProcessLaunch(new ProcessLaunchId(sourceDto.getIdProcessLaunch()));

  }

}