  package ctag.dtos.assembler.tot_page;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_PageAssembler extends BaseAssembler<TOT_Page, TOT_PageRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final TOT_PageRepresentation targetDto,TOT_Page sourceAggregate){

     targetDto.setIdTOT_Page(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
targetDto.setOrder(sourceAggregate.getOrder());
targetDto.setActive(sourceAggregate.getActive());
  }

  @Override
  public void doMergeAggregateWithDto(final TOT_Page targetAggregate, final TOT_PageRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());
targetAggregate.setOrder(sourceDto.getOrder());
targetAggregate.setActive(sourceDto.getActive());

  }

}