package ctag.domain.model.tot_doctype;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class Tot_doctypeId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public Tot_doctypeId() {
  }

  public Tot_doctypeId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}