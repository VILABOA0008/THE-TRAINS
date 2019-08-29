package ctag.domain.model.parameter;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ParameterId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ParameterId() {
  }

  public ParameterId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}