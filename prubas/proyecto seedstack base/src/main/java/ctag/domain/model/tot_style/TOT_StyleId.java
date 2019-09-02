package ctag.domain.model.tot_style;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class Tot_styleId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public Tot_styleId() {
  }

  public Tot_styleId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}