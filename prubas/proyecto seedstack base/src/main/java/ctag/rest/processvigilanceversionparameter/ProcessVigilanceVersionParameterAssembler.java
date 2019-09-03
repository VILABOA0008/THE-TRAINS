  package ctag.dtos.assembler.processvigilanceversionparameter;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.parameter.ParameterId;
public class ProcessVigilanceVersionParameterAssembler extends BaseAssembler<ProcessVigilanceVersionParameter, ProcessVigilanceVersionParameterRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ProcessVigilanceVersionParameterRepresentation targetDto,ProcessVigilanceVersionParameter sourceAggregate){

     targetDto.setIdProcessVigilanceVersionParameter(sourceAggregate.getEntityId().getId()); 
targetDto.setIdProcessVigilanceVersion(sourceAggregate.getIdProcessVigilanceVersion());
targetDto.setIdParameter(sourceAggregate.getIdParameter());
targetDto.setPoint(sourceAggregate.getPoint());
targetDto.setNominal(sourceAggregate.getNominal());
targetDto.setBooleanNominal(sourceAggregate.getBooleanNominal());
targetDto.setIdProcessVigilanceVersion(sourceAggregate.getIdProcessVigilanceVersion().getId());
targetDto.setIdParameter(sourceAggregate.getIdParameter().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final ProcessVigilanceVersionParameter targetAggregate, final ProcessVigilanceVersionParameterRepresentation sourceDto){
targetAggregate.setIdProcessVigilanceVersion(sourceDto.getIdProcessVigilanceVersion());
targetAggregate.setIdParameter(sourceDto.getIdParameter());
targetAggregate.setPoint(sourceDto.getPoint());
targetAggregate.setNominal(sourceDto.getNominal());
targetAggregate.setBooleanNominal(sourceDto.getBooleanNominal());
targetAggregate.setIdProcessVigilanceVersion(new ProcessVigilanceVersionId(sourceDto.getIdProcessVigilanceVersion()));
targetAggregate.setIdParameter(new ParameterId(sourceDto.getIdParameter()));

  }

}