package ctag.domain.model.design;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class DesignId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public DesignId() {
  }

  public DesignId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}