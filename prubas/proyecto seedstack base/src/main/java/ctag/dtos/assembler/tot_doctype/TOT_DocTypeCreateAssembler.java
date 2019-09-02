  package ctag.dtos.assembler.tot_doctype;

import org.seedstack.business.assembler.BaseAssembler;
public class Tot_doctypeCreateAssembler extends BaseAssembler<Tot_doctype, Tot_doctypeCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Tot_doctype sourceAggregate, Tot_doctypeCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_doctypeCreateDto sourceDto,Tot_doctype targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}