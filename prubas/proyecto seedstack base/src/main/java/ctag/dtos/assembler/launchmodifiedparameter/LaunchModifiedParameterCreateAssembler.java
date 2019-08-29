  package ctag.dtos.assembler.launchmodifiedparameter;

import org.seedstack.business.assembler.BaseAssembler;
public class LaunchModifiedParameterCreateAssembler extends BaseAssembler<LaunchModifiedParameter, LaunchModifiedParameterCreateDto> {

  @Override
  public void mergeAggregateIntoDto(LaunchModifiedParameter sourceAggregate, LaunchModifiedParameterCreateDto targetDto) {
targetDto.setIdConfiguredParameter(sourceAggregate.getIdConfiguredParameter());
targetDto.setIdLaunch(sourceAggregate.getIdLaunch());
targetDto.setValue(sourceAggregate.getValue());
targetDto.setBooleanValue(sourceAggregate.getBooleanValue());
targetDto.setComment(sourceAggregate.getComment());
targetDto.setIdProcessVigilanceVersionParameter(sourceAggregate.getIdProcessVigilanceVersionParameter().getId());
targetDto.setIdProcessLaunch(sourceAggregate.getIdProcessLaunch().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(LaunchModifiedParameterCreateDto sourceDto,LaunchModifiedParameter targetAggregate) {
targetAggregate.setIdConfiguredParameter(sourceDto.getIdConfiguredParameter());
targetAggregate.setIdLaunch(sourceDto.getIdLaunch());
targetAggregate.setValue(sourceDto.getValue());
targetAggregate.setBooleanValue(sourceDto.getBooleanValue());
targetAggregate.setComment(sourceDto.getComment());
targetAggregate.setIdProcessVigilanceVersionParameter(new ProcessVigilanceVersionParameterId(sourceDto.getIdProcessVigilanceVersionParameter()));
targetAggregate.setIdProcessLaunch(new ProcessLaunchId(sourceDto.getIdProcessLaunch()));

  }

}