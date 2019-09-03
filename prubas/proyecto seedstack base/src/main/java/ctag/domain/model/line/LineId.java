package ctag.domain.model.line;

import javax.persistence.Embeddable;

import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class LineId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public LineId() {
  }

  public LineId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}