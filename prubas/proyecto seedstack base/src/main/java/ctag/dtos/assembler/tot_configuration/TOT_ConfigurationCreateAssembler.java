  package ctag.dtos.assembler.tot_configuration;

import org.seedstack.business.assembler.BaseAssembler;
public class TOT_ConfigurationCreateAssembler extends BaseAssembler<TOT_Configuration, TOT_ConfigurationCreateDto> {

  @Override
  public void mergeAggregateIntoDto(TOT_Configuration sourceAggregate, TOT_ConfigurationCreateDto targetDto) {
targetDto.setValue(sourceAggregate.getValue());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_ConfigurationCreateDto sourceDto,TOT_Configuration targetAggregate) {
targetAggregate.setValue(sourceDto.getValue());

  }

}