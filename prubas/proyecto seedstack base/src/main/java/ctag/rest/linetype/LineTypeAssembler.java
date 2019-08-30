  package ctag.dtos.assembler.linetype;

import org.seedstack.business.assembler.BaseAssembler;
public class LineTypeAssembler extends BaseAssembler<LineType, LineTypeRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final LineTypeRepresentation targetDto,LineType sourceAggregate){

     targetDto.setIdLineType(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setActive(sourceAggregate.getActive());
  }

  @Override
  public void doMergeAggregateWithDto(final LineType targetAggregate, final LineTypeRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setActive(sourceDto.getActive());

  }

}