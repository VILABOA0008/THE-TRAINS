package ctag.domain.model.reworkbatch;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ReworkBatchId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ReworkBatchId() {
  }

  public ReworkBatchId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}