package ctag.dtos.dto.processvigilance;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessVigilance  ")public class ProcessVigilanceDto extends ProcessVigilanceCreateDto {

  private Integer idProcessVigilance;

  @JsonIgnore
@AggregateId
  private ProcessVigilanceId getId() {
    return new ProcessVigilanceId(idProcessVigilance);
  }

  @JsonProperty("idProcessVigilance")
  public Integer getIdProcessVigilance() {
    return idProcessVigilance;
  }

  public void setIdProcessVigilance(Integer idProcessVigilance) {
    this.idProcessVigilance = idProcessVigilance;
  }
}