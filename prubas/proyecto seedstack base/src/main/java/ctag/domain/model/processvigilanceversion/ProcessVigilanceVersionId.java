package ctag.domain.model.processvigilanceversion;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ProcessVigilanceVersionId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ProcessVigilanceVersionId() {
  }

  public ProcessVigilanceVersionId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}