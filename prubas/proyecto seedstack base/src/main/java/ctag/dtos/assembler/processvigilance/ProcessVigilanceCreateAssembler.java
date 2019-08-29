  package ctag.dtos.assembler.processvigilance;

import org.seedstack.business.assembler.BaseAssembler;
public class ProcessVigilanceCreateAssembler extends BaseAssembler<ProcessVigilance, ProcessVigilanceCreateDto> {

  @Override
  public void mergeAggregateIntoDto(ProcessVigilance sourceAggregate, ProcessVigilanceCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setCHR(sourceAggregate.getCHR());
targetDto.setProgramNumber(sourceAggregate.getProgramNumber());
targetDto.setIdBom(sourceAggregate.getIdBom().getId());
targetDto.setIdLine(sourceAggregate.getIdLine().getId());
targetDto.setIdProcessVigilanceState(sourceAggregate.getIdProcessVigilanceState().getId());
targetDto.setIdSourceMaterialType(sourceAggregate.getIdSourceMaterialType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(ProcessVigilanceCreateDto sourceDto,ProcessVigilance targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setCHR(sourceDto.getCHR());
targetAggregate.setProgramNumber(sourceDto.getProgramNumber());
targetAggregate.setIdBom(new BomId(sourceDto.getIdBom()));
targetAggregate.setIdLine(new LineId(sourceDto.getIdLine()));
targetAggregate.setIdProcessVigilanceState(new ProcessVigilanceStateId(sourceDto.getIdProcessVigilanceState()));
targetAggregate.setIdSourceMaterialType(new SourceMaterialTypeId(sourceDto.getIdSourceMaterialType()));

  }

}