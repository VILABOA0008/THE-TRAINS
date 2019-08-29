package ctag.domain.model.tot_style;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class TOT_StyleId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public TOT_StyleId() {
  }

  public TOT_StyleId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}