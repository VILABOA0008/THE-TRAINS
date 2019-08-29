package com.ctag.paperless.domain.model.processvigilancestate;

import javax.persistence.Embeddable;
import org.seedstack.business.domain.BaseValueObject;
@Embeddable
public class ProcessVigilanceStateId extends BaseValueObject {


  private static final long serialVersionUID = 1;
  private Integer id;

  public ProcessVigilanceStateId() {
  }

  public ProcessVigilanceStateId(Integer id) {
     this.id = id;
  }


  public Integer getId() {
    return id;
  }


}