  package ctag.dtos.assembler.processvigilance3;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilance3CreateAssembler extends BaseAssembler<ProcessVigilance3, ProcessVigilance3CreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessVigilance3 sourceAggregate, ProcessVigilance3CreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setCHR(sourceAggregate.getCHR());
targetDto.setProgramNumber(sourceAggregate.getProgramNumber());
targetDto.setIdBom(sourceAggregate.getIdBom().getId());
targetDto.setIdLine(sourceAggregate.getIdLine().getId());
targetDto.setIdProcessVigilanceState(sourceAggregate.getIdProcessVigilanceState().getId());
targetDto.setIdSourceMaterialType(sourceAggregate.getIdSourceMaterialType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilance3CreateDto sourceDto,ProcessVigilance3 targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setCHR(sourceDto.getCHR());
targetAggregate.setProgramNumber(sourceDto.getProgramNumber());
targetAggregate.setIdBom(new BomId(sourceDto.getIdBom()));
targetAggregate.setIdLine(new LineId(sourceDto.getIdLine()));
targetAggregate.setIdProcessVigilanceState(new ProcessVigilanceStateId(sourceDto.getIdProcessVigilanceState()));
targetAggregate.setIdSourceMaterialType(new SourceMaterialTypeId(sourceDto.getIdSourceMaterialType()));

  }

}