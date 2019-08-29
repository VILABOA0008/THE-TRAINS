package ctag.domain.model.processvigilancewarning;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ProcessVigilanceWarningId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ProcessVigilanceWarningId() {
  }

  public ProcessVigilanceWarningId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}