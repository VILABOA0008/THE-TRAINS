package ctag.domain.model.psashift;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class PsaShiftId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public PsaShiftId() {
  }

  public PsaShiftId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}