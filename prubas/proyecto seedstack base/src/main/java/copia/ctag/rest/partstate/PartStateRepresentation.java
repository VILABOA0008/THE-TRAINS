package ctag.dtos.dto.partstate;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.partstate.PartState;

@DtoOf(PartState.class)
public class PartStateRepresentation {

  private Integer idPartState;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdPartState() {
    return idPartState;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdPartState(Integer idPartState) {
    this.idPartState = idPartState;
  }
}