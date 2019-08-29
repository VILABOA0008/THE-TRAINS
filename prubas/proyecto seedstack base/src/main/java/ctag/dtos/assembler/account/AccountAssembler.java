  package ctag.dtos.assembler.account;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class AccountAssembler extends BaseAssembler<Account, AccountDto> {

  private final Assembler<Account, AccountCreateDto> assembler;

  @Inject
  public AccountAssembler(
      Assembler<Account, AccountCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Account sourceAggregate, AccountDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdAccount(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(AccountDto sourceDto, Account targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
