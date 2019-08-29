package ctag.dtos.dto.processvigilance2;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessVigilance2  ")public class ProcessVigilance2Dto extends ProcessVigilance2CreateDto {

  private Integer idProcessVigilance2;

  @JsonIgnore
@AggregateId
  private ProcessVigilance2Id getId() {
    return new ProcessVigilance2Id(idProcessVigilance2);
  }

  @JsonProperty("idProcessVigilance2")
  public Integer getIdProcessVigilance2() {
    return idProcessVigilance2;
  }

  public void setIdProcessVigilance2(Integer idProcessVigilance2) {
    this.idProcessVigilance2 = idProcessVigilance2;
  }
}