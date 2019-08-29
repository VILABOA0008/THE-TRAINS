package ctag.domain.model.processvigilance;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ProcessVigilanceId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ProcessVigilanceId() {
  }

  public ProcessVigilanceId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}