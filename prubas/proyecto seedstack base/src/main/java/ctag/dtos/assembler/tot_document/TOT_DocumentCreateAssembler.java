  package ctag.dtos.assembler.tot_document;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_DocumentCreateAssembler extends BaseAssembler<TOT_Document, TOT_DocumentCreateDto> {

  @Override
  public void mergeAggregateIntoDto(TOT_Document sourceAggregate, TOT_DocumentCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setLink(sourceAggregate.getLink());
targetDto.setIdTOT_DocType(sourceAggregate.getIdTOT_DocType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_DocumentCreateDto sourceDto,TOT_Document targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setLink(sourceDto.getLink());
targetAggregate.setIdTOT_DocType(new TOT_DocTypeId(sourceDto.getIdTOT_DocType()));

  }

}