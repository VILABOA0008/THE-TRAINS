package ctag.dtos.dto.processvigilance3;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessVigilance3  ")public class ProcessVigilance3Dto extends ProcessVigilance3CreateDto {

  private Integer idProcessVigilance3;

  @JsonIgnore
@AggregateId
  private ProcessVigilance3Id getId() {
    return new ProcessVigilance3Id(idProcessVigilance3);
  }

  @JsonProperty("idProcessVigilance3")
  public Integer getIdProcessVigilance3() {
    return idProcessVigilance3;
  }

  public void setIdProcessVigilance3(Integer idProcessVigilance3) {
    this.idProcessVigilance3 = idProcessVigilance3;
  }
}