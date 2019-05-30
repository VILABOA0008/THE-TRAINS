package ctag.domain.model.aggregate.modelospruebas;

import org.seedstack.business.domain.BaseValueObject;

public class StyleId extends BaseValueObject {

  private static final long serialVersionUID = 1;
  private Integer id;

  public StyleId() {
  }

  public StyleId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }
}