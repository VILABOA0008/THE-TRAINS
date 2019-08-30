  package ctag.dtos.assembler.account;

import org.seedstack.business.assembler.BaseAssembler;
public class AccountAssembler extends BaseAssembler<Account, AccountRepresentation> {

  @Override
  public void doAssembleDtoFromAggregate(final AccountRepresentation targetDto,Account sourceAggregate){

     targetDto.setIdAccount(sourceAggregate.getEntityId().getId()); 
targetDto.setName(sourceAggregate.getName());
  }

  @Override
  public void doMergeAggregateWithDto(final Account targetAggregate, final AccountRepresentation sourceDto){
targetAggregate.setName(sourceDto.getName());

  }

}