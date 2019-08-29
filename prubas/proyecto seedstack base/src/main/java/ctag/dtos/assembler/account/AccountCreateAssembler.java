  package ctag.dtos.assembler.account;

import org.seedstack.business.assembler.BaseAssembler;
public class AccountCreateAssembler extends BaseAssembler<Account, AccountCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Account sourceAggregate, AccountCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void mergeDtoIntoAggregate(AccountCreateDto sourceDto,Account targetAggregate) {
targetAggregate.setName(sourceDto.getName());

  }

}