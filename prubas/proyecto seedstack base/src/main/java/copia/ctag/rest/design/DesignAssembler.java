  package ctag.dtos.assembler.design;

import org.seedstack.business.assembler.BaseAssembler;
public class DesignAssembler extends BaseAssembler<Design, DesignRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final DesignRepresentation targetDto,Design sourceAggregate){

     targetDto.setIdDesign(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setCode(sourceAggregate.getCode());
  }

  @Override
  public void doMergeAggregateWithDto(final Design targetAggregate, final DesignRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setCode(sourceDto.getCode());

  }

}