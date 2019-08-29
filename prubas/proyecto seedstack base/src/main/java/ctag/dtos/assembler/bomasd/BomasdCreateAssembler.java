  package ctag.dtos.assembler.bomasd;

import org.seedstack.business.assembler.BaseAssembler;
public class BomasdCreateAssembler extends BaseAssembler<Bomasd, BomasdCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Bomasd sourceAggregate, BomasdCreateDto targetDto) {
targetDto.setIdDesign(sourceAggregate.getIdDesign().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(BomasdCreateDto sourceDto,Bomasd targetAggregate) {
targetAggregate.setIdDesign(new DesignId(sourceDto.getIdDesign()));

  }

}