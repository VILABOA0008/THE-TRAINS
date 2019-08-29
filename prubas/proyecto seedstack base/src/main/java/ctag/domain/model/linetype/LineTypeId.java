package ctag.domain.model.linetype;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class LineTypeId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public LineTypeId() {
  }

  public LineTypeId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}