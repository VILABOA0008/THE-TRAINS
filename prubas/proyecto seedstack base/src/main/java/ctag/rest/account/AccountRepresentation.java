package ctag.dtos.dto.account;


import ctag.domain.model.aggregate.modelospruebas.Account;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Account.class)
public class AccountRepresentation {

  private Integer idAccount;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdAccount() {
    return idAccount;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdAccount(Integer idAccount) {
    this.idAccount = idAccount;
  }
}