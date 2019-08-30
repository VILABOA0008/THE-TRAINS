package ctag.domain.model.tot_button;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class TOT_ButtonId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public TOT_ButtonId() {
  }

  public TOT_ButtonId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}