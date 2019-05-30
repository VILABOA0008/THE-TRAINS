package ctag.domain.model.aggregate.modelospruebas;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class CustomersId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public CustomersId() {
  }

  public CustomersId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}