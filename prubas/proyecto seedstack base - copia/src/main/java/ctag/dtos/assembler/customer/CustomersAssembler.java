  package ctag.dtos.assembler.customer;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class CustomersAssembler extends BaseAssembler<Customers, CustomersDto> {

  private final Assembler<Customers, CustomersCreateDto> assembler;

  @Inject
  public CustomersAssembler(
      Assembler<Customers, CustomersCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Customers sourceAggregate, CustomersDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdCustomers(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(CustomersDto sourceDto, Customers targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
