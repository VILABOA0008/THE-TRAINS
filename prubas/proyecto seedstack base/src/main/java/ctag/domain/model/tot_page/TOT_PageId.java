package ctag.domain.model.tot_page;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class TOT_PageId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public TOT_PageId() {
  }

  public TOT_PageId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}