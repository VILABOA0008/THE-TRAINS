package ctag.domain.model.launchmodifiedparameter;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class LaunchModifiedParameterId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public LaunchModifiedParameterId() {
  }

  public LaunchModifiedParameterId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}