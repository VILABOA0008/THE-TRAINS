package ctag.domain.model.linetypeparameter;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class LineTypeParameterId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer idParameter;
private Integer idLineType;

  public LineTypeParameterId() {
  }

   public LineTypeParameterId(Integer idParameter, Integer idLineType) {
    this.idParameter = idParameter;
    this.idLineType = idLineType;
  }


   public ParameterId getParameterId() {
    return new ParameterId(idParameter);
  }
 
  public LineTypeId getLineTypeId() {
    return new LineTypeId(idLineType);
  }}