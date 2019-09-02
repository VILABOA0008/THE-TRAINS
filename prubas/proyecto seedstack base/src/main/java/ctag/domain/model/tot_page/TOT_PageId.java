package ctag.domain.model.tot_page;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class Tot_pageId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public Tot_pageId() {
  }

  public Tot_pageId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}