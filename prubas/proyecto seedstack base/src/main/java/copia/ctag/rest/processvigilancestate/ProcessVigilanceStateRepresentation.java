package ctag.dtos.dto.processvigilancestate;


import ctag.domain.model.aggregate.modelospruebas.ProcessVigilanceState;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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