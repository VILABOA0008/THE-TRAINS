package ctag.dtos.dto.coillaunch;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " CoilLaunch  ")public class CoilLaunchDto extends CoilLaunchCreateDto {

  private Integer idCoilLaunch;

  @JsonIgnore
@AggregateId
  private CoilLaunchId getId() {
    return new CoilLaunchId(idCoilLaunch);
  }

  @JsonProperty("idCoilLaunch")
  public Integer getIdCoilLaunch() {
    return idCoilLaunch;
  }

  public void setIdCoilLaunch(Integer idCoilLaunch) {
    this.idCoilLaunch = idCoilLaunch;
  }
}