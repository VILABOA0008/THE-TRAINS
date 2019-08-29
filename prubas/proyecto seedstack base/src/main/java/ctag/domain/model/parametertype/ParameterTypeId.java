package ctag.domain.model.parametertype;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ParameterTypeId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ParameterTypeId() {
  }

  public ParameterTypeId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}