package ctag.domain.model.tot_document;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class Tot_documentId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public Tot_documentId() {
  }

  public Tot_documentId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}