  package ctag.dtos.assembler.design;

import org.seedstack.business.assembler.BaseAssembler;
public class DesignCreateAssembler extends BaseAssembler<Design, DesignCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Design sourceAggregate, DesignCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setCode(sourceAggregate.getCode());
  }

  @Override
  public void mergeDtoIntoAggregate(DesignCreateDto sourceDto,Design targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setCode(sourceDto.getCode());

  }

}