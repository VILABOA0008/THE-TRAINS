  package ctag.dtos.assembler.bom;

import org.seedstack.business.assembler.BaseAssembler;
public class BomAssembler extends BaseAssembler<Bom, BomRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final BomRepresentation targetDto,Bom sourceAggregate){

     targetDto.setIdBom(sourceAggregate.getEntityId().getId()); 
targetDto.setIdDesign(sourceAggregate.getIdDesign().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final Bom targetAggregate, final BomRepresentation sourceDto){
targetAggregate.setIdDesign(new DesignId(sourceDto.getIdDesign()));

  }

}