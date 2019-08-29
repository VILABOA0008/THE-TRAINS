package ctag.domain.model.part;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class PartId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public PartId() {
  }

  public PartId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}