package ctag.domain.model.declarationtype;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class DeclarationTypeId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public DeclarationTypeId() {
  }

  public DeclarationTypeId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}