package ctag.dtos.dto.account;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Account  ")public class AccountDto extends AccountCreateDto {

  private Integer idAccount;

  @JsonIgnore
@AggregateId
  private AccountId getId() {
    return new AccountId(idAccount);
  }

  @JsonProperty("idAccount")
  public Integer getIdAccount() {
    return idAccount;
  }

  public void setIdAccount(Integer idAccount) {
    this.idAccount = idAccount;
  }
}