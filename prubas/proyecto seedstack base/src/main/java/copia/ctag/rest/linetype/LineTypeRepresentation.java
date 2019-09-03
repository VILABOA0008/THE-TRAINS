package ctag.dtos.dto.linetype;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.aggregate.modelospruebas.LineType;

@DtoOf(LineType.class)
public class LineTypeRepresentation {

  private Integer idLineType;
private String name;
private boolean active;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdLineType() {
    return idLineType;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

 @MatchingFactoryParameter(index = 2)
  public boolean getActive() {
    return active;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setIdLineType(Integer idLineType) {
    this.idLineType = idLineType;
  }
}