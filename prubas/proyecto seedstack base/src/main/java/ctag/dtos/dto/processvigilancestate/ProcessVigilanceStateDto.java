package ctag.dtos.dto.processvigilancestate;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessVigilanceState  ")public class ProcessVigilanceStateDto extends ProcessVigilanceStateCreateDto {

  private Integer idProcessVigilanceState;

  @JsonIgnore
@AggregateId
  private ProcessVigilanceStateId getId() {
    return new ProcessVigilanceStateId(idProcessVigilanceState);
  }

  @JsonProperty("idProcessVigilanceState")
  public Integer getIdProcessVigilanceState() {
    return idProcessVigilanceState;
  }

  public void setIdProcessVigilanceState(Integer idProcessVigilanceState) {
    this.idProcessVigilanceState = idProcessVigilanceState;
  }
}