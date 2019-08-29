package ctag.dtos.dto.processvigilanceversion;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessVigilanceVersion  ")public class ProcessVigilanceVersionDto extends ProcessVigilanceVersionCreateDto {

  private Integer idProcessVigilanceVersion;

  @JsonIgnore
@AggregateId
  private ProcessVigilanceVersionId getId() {
    return new ProcessVigilanceVersionId(idProcessVigilanceVersion);
  }

  @JsonProperty("idProcessVigilanceVersion")
  public Integer getIdProcessVigilanceVersion() {
    return idProcessVigilanceVersion;
  }

  public void setIdProcessVigilanceVersion(Integer idProcessVigilanceVersion) {
    this.idProcessVigilanceVersion = idProcessVigilanceVersion;
  }
}