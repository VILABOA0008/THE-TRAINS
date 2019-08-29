package ctag.domain.model.account;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class AccountId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public AccountId() {
  }

  public AccountId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}