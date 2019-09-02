package ctag.domain.model.tot_button;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class Tot_buttonId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public Tot_buttonId() {
  }

  public Tot_buttonId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}