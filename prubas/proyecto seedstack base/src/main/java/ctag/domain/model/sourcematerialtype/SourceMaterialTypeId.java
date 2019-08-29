package ctag.domain.model.sourcematerialtype;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class SourceMaterialTypeId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public SourceMaterialTypeId() {
  }

  public SourceMaterialTypeId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}