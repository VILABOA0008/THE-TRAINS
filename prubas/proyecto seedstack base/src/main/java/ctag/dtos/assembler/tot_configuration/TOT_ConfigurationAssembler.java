  package ctag.dtos.assembler.tot_configuration;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class TOT_ConfigurationAssembler extends BaseAssembler<TOT_Configuration, TOT_ConfigurationDto> {

  private final Assembler<TOT_Configuration, TOT_ConfigurationCreateDto> assembler;

  @Inject
  public TOT_ConfigurationAssembler(
      Assembler<TOT_Configuration, TOT_ConfigurationCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(TOT_Configuration sourceAggregate, TOT_ConfigurationDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdTOT_Configuration(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(TOT_ConfigurationDto sourceDto, TOT_Configuration targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
