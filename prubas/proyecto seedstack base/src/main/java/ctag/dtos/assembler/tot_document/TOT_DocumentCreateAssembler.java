  package ctag.dtos.assembler.tot_document;

import org.seedstack.business.assembler.BaseAssembler;
public class Tot_documentCreateAssembler extends BaseAssembler<Tot_document, Tot_documentCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Tot_document sourceAggregate, Tot_documentCreateDto targetDto) {
targetDto.setDocType(sourceAggregate.getDocType());
targetDto.setName(sourceAggregate.getName());
targetDto.setLink(sourceAggregate.getLink());
targetDto.setPosition(sourceAggregate.getPosition());
targetDto.setIdTOT_DocType(sourceAggregate.getIdTOT_DocType().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(Tot_documentCreateDto sourceDto,Tot_document targetAggregate) {
targetAggregate.setDocType(sourceDto.getDocType());
targetAggregate.setName(sourceDto.getName());
targetAggregate.setLink(sourceDto.getLink());
targetAggregate.setPosition(sourceDto.getPosition());
targetAggregate.setIdTOT_DocType(new TOT_DocTypeId(sourceDto.getIdTOT_DocType()));

  }

}