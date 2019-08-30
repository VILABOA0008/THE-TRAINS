  package ctag.dtos.assembler.tot_doctype;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_DocTypeAssembler extends BaseAssembler<TOT_DocType, TOT_DocTypeRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final TOT_DocTypeRepresentation targetDto,TOT_DocType sourceAggregate){

     targetDto.setIdTOT_DocType(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void doMergeAggregateWithDto(final TOT_DocType targetAggregate, final TOT_DocTypeRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());

  }

}