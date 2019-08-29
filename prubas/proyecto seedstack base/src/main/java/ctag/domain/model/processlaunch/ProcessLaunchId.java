package ctag.domain.model.processlaunch;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ProcessLaunchId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ProcessLaunchId() {
  }

  public ProcessLaunchId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}