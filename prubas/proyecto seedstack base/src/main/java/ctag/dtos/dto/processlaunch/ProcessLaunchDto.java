package ctag.dtos.dto.processlaunch;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessLaunch  ")public class ProcessLaunchDto extends ProcessLaunchCreateDto {

  private Integer idProcessLaunch;

  @JsonIgnore
@AggregateId
  private ProcessLaunchId getId() {
    return new ProcessLaunchId(idProcessLaunch);
  }

  @JsonProperty("idProcessLaunch")
  public Integer getIdProcessLaunch() {
    return idProcessLaunch;
  }

  public void setIdProcessLaunch(Integer idProcessLaunch) {
    this.idProcessLaunch = idProcessLaunch;
  }
}