  package ctag.dtos.assembler.customer;

import org.seedstack.business.assembler.BaseAssembler;
public class CustomersCreateAssembler extends BaseAssembler<Customers, CustomersCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Customers sourceAggregate, CustomersCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setUsername(sourceAggregate.getUsername());
targetDto.setAge(sourceAggregate.getAge());
targetDto.setIdStyle(sourceAggregate.getIdStyle().getId());
targetDto.setIdPage(sourceAggregate.getIdPage().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(CustomersCreateDto sourceDto,Customers targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setUsername(sourceDto.getUsername());
targetAggregate.setAge(sourceDto.getAge());
targetAggregate.setIdStyle(new StyleId(sourceDto.getIdStyle()));
targetAggregate.setIdPage(new PageId(sourceDto.getIdPage()));

  }

}