package ctag.domain.model.bom;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class BomId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public BomId() {
  }

  public BomId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}