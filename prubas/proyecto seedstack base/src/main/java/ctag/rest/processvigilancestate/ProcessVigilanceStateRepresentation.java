package ctag.dtos.dto.processvigilancestate;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceState;

@DtoOf(ProcessVigilanceState.class)
public class ProcessVigilanceStateRepresentation {

  private Integer idProcessVigilanceState;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdProcessVigilanceState() {
    return idProcessVigilanceState;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdProcessVigilanceState(Integer idProcessVigilanceState) {
    this.idProcessVigilanceState = idProcessVigilanceState;
  }
}