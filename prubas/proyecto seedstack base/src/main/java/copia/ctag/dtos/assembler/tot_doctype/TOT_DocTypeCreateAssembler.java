  package ctag.dtos.assembler.tot_doctype;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_DocTypeCreateAssembler extends BaseAssembler<TOT_DocType, TOT_DocTypeCreateDto> {

  @Override
  public void mergeAggregateIntoDto(TOT_DocType sourceAggregate, TOT_DocTypeCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_DocTypeCreateDto sourceDto,TOT_DocType targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}