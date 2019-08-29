  package ctag.dtos.assembler.bom;

import org.seedstack.business.assembler.BaseAssembler;
public class BomCreateAssembler extends BaseAssembler<Bom, BomCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Bom sourceAggregate, BomCreateDto targetDto) {
targetDto.setIdDesign(sourceAggregate.getIdDesign().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(BomCreateDto sourceDto,Bom targetAggregate) {
targetAggregate.setIdDesign(new DesignId(sourceDto.getIdDesign()));

  }

}