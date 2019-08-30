package ctag.domain.model.tot_document;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class TOT_DocumentId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public TOT_DocumentId() {
  }

  public TOT_DocumentId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}