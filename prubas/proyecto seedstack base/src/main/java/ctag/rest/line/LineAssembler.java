  package ctag.dtos.assembler.line;

import org.seedstack.business.assembler.BaseAssembler;
public class LineAssembler extends BaseAssembler<Line, LineRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final LineRepresentation targetDto,Line sourceAggregate){

     targetDto.setIdLine(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setIdLineType(sourceAggregate.getIdLineType().getId());
  }

  @Override
  public void doMergeAggregateWithDto(final Line targetAggregate, final LineRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setIdLineType(new LineTypeId(sourceDto.getIdLineType()));

  }

}