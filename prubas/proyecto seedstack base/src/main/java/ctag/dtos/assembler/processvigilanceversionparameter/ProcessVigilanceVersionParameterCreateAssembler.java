  package ctag.dtos.assembler.processvigilanceversionparameter;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilanceVersionParameterCreateAssembler extends BaseAssembler<ProcessVigilanceVersionParameter, ProcessVigilanceVersionParameterCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceVersionParameter sourceAggregate, ProcessVigilanceVersionParameterCreateDto targetDto) {
targetDto.setIdProcessVigilanceVersion(sourceAggregate.getIdProcessVigilanceVersion());
targetDto.setIdParameter(sourceAggregate.getIdParameter());
targetDto.setPoint(sourceAggregate.getPoint());
targetDto.setNominal(sourceAggregate.getNominal());
targetDto.setBooleanNominal(sourceAggregate.getBooleanNominal());
targetDto.setIdProcessVigilanceVersion(sourceAggregate.getIdProcessVigilanceVersion().getId());
targetDto.setIdParameter(sourceAggregate.getIdParameter().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceVersionParameterCreateDto sourceDto,ProcessVigilanceVersionParameter targetAggregate) {
targetAggregate.setIdProcessVigilanceVersion(sourceDto.getIdProcessVigilanceVersion());
targetAggregate.setIdParameter(sourceDto.getIdParameter());
targetAggregate.setPoint(sourceDto.getPoint());
targetAggregate.setNominal(sourceDto.getNominal());
targetAggregate.setBooleanNominal(sourceDto.getBooleanNominal());
targetAggregate.setIdProcessVigilanceVersion(new ProcessVigilanceVersionId(sourceDto.getIdProcessVigilanceVersion()));
targetAggregate.setIdParameter(new ParameterId(sourceDto.getIdParameter()));

  }

}