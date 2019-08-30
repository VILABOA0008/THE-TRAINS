package ctag.domain.model.tot_doctype;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class TOT_DocTypeId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public TOT_DocTypeId() {
  }

  public TOT_DocTypeId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}