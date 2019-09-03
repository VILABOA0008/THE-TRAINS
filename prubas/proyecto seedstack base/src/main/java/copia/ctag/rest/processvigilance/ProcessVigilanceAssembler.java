  package ctag.dtos.assembler.processvigilance;

import org.seedstack.business.assembler.BaseAssembler;

import ctag.domain.model.bom.BomId;
import ctag.domain.model.line.LineId;
import ctag.domain.model.processvigilance.ProcessVigilance;
import ctag.domain.model.processvigilancestate.ProcessVigilanceStateId;
import ctag.domain.model.sourcematerialtype.SourceMaterialTypeId;
public class ProcessVigilanceAssembler extends BaseAssembler<ProcessVigilance, ProcessVigilanceRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final ProcessVigilanceRepresentation targetDto,ProcessVigilance sourceAggregate){

     targetDto.setIdProcessVigilance(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setCHR(sourceAggregate.getCHR());
targetDto.setProgramNumber(sourceAggregate.getProgramNumber());
targetDto.setIdBom(sourceAggregate.getIdBom().getId());
targetDto.setIdLine(sourceAggregate.getIdLine().getId());
targetDto.setIdProcessVigilanceState(sourceAggregate.getIdProcessVigilanceState().getId());
targetDto.setIdSourceMaterialType(sourceAggregate.getIdSourceMaterialType().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final ProcessVigilance targetAggregate, final ProcessVigilanceRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setCHR(sourceDto.getCHR());
targetAggregate.setProgramNumber(sourceDto.getProgramNumber());
targetAggregate.setIdBom(new BomId(sourceDto.getIdBom()));
targetAggregate.setIdLine(new LineId(sourceDto.getIdLine()));
targetAggregate.setIdProcessVigilanceState(new ProcessVigilanceStateId(sourceDto.getIdProcessVigilanceState()));
targetAggregate.setIdSourceMaterialType(new SourceMaterialTypeId(sourceDto.getIdSourceMaterialType()));

  }

}