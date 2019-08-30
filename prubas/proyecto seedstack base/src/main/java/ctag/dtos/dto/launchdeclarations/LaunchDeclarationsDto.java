package ctag.dtos.dto.launchdeclarations;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " LaunchDeclarations  ")public class LaunchDeclarationsDto extends LaunchDeclarationsCreateDto {

  private Integer idLaunchDeclarations;

  @JsonIgnore
@AggregateId
  private LaunchDeclarationsId getId() {
    return new LaunchDeclarationsId(idLaunchDeclarations);
  }

  @JsonProperty("idLaunchDeclarations")
  public Integer getIdLaunchDeclarations() {
    return idLaunchDeclarations;
  }

  public void setIdLaunchDeclarations(Integer idLaunchDeclarations) {
    this.idLaunchDeclarations = idLaunchDeclarations;
  }
}