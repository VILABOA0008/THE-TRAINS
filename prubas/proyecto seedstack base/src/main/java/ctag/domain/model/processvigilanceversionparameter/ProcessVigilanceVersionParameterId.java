package ctag.domain.model.processvigilanceversionparameter;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ProcessVigilanceVersionParameterId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ProcessVigilanceVersionParameterId() {
  }

  public ProcessVigilanceVersionParameterId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}