package ctag.domain.model.coillaunch;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class CoilLaunchId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public CoilLaunchId() {
  }

  public CoilLaunchId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}