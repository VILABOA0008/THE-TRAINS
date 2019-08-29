  package ctag.dtos.assembler.processvigilancestate;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilanceStateCreateAssembler extends BaseAssembler<ProcessVigilanceState, ProcessVigilanceStateCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessVigilanceState sourceAggregate, ProcessVigilanceStateCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceStateCreateDto sourceDto,ProcessVigilanceState targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}