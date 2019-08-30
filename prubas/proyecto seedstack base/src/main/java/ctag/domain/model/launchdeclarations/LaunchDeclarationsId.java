package ctag.domain.model.launchdeclarations;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class LaunchDeclarationsId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public LaunchDeclarationsId() {
  }

  public LaunchDeclarationsId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}