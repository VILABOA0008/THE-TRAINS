package ctag.domain.model.account;


public interface AccountFactory extends GenericFactory<Account> {
  
 Account createAccount(String name);

 Account createAccount(Integer AccountId, String name);


}
