package ctag.dtos.dto.launchmodifiedparameter;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " LaunchModifiedParameter  ")public class LaunchModifiedParameterDto extends LaunchModifiedParameterCreateDto {

  private Integer idLaunchModifiedParameter;

  @JsonIgnore
@AggregateId
  private LaunchModifiedParameterId getId() {
    return new LaunchModifiedParameterId(idLaunchModifiedParameter);
  }

  @JsonProperty("idLaunchModifiedParameter")
  public Integer getIdLaunchModifiedParameter() {
    return idLaunchModifiedParameter;
  }

  public void setIdLaunchModifiedParameter(Integer idLaunchModifiedParameter) {
    this.idLaunchModifiedParameter = idLaunchModifiedParameter;
  }
}