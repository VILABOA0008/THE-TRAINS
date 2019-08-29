  package ctag.dtos.assembler.processvigilance2;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilance2CreateAssembler extends BaseAssembler<ProcessVigilance2, ProcessVigilance2CreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessVigilance2 sourceAggregate, ProcessVigilance2CreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setCHR(sourceAggregate.getCHR());
targetDto.setProgramNumber(sourceAggregate.getProgramNumber());
targetDto.setIdBom(sourceAggregate.getIdBom().getId());
targetDto.setIdLine(sourceAggregate.getIdLine().getId());
targetDto.setIdProcessVigilanceState(sourceAggregate.getIdProcessVigilanceState().getId());
targetDto.setIdSourceMaterialType(sourceAggregate.getIdSourceMaterialType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilance2CreateDto sourceDto,ProcessVigilance2 targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setCHR(sourceDto.getCHR());
targetAggregate.setProgramNumber(sourceDto.getProgramNumber());
targetAggregate.setIdBom(new BomId(sourceDto.getIdBom()));
targetAggregate.setIdLine(new LineId(sourceDto.getIdLine()));
targetAggregate.setIdProcessVigilanceState(new ProcessVigilanceStateId(sourceDto.getIdProcessVigilanceState()));
targetAggregate.setIdSourceMaterialType(new SourceMaterialTypeId(sourceDto.getIdSourceMaterialType()));

  }

}