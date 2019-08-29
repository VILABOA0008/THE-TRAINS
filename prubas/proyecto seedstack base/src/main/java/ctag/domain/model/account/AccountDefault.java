package ctag.application.factoryimpl.account;


import ctag.domain.model.account.*;

import org.seedstack.business.domain.BaseFactory; 

public class AccountDefault extends BaseFactory<Account> implements AccountFactory {

  @Override
  public Account createAccount(String name) {

    Account tmpAccount = create();


  tmpAccount.setName(name);

    return tmpAccount;
  }

}
