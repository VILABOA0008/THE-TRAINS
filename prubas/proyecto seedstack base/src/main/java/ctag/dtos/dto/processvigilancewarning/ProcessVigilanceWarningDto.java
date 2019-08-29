package ctag.dtos.dto.processvigilancewarning;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ProcessVigilanceWarning  ")public class ProcessVigilanceWarningDto extends ProcessVigilanceWarningCreateDto {

  private Integer idProcessVigilanceWarning;

  @JsonIgnore
@AggregateId
  private ProcessVigilanceWarningId getId() {
    return new ProcessVigilanceWarningId(idProcessVigilanceWarning);
  }

  @JsonProperty("idProcessVigilanceWarning")
  public Integer getIdProcessVigilanceWarning() {
    return idProcessVigilanceWarning;
  }

  public void setIdProcessVigilanceWarning(Integer idProcessVigilanceWarning) {
    this.idProcessVigilanceWarning = idProcessVigilanceWarning;
  }
}