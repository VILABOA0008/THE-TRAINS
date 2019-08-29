package ctag.domain.model.partstate;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class PartStateId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public PartStateId() {
  }

  public PartStateId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}