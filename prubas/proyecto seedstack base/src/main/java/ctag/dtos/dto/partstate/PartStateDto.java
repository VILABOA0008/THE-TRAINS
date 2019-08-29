package ctag.dtos.dto.partstate;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " PartState  ")public class PartStateDto extends PartStateCreateDto {

  private Integer idPartState;

  @JsonIgnore
@AggregateId
  private PartStateId getId() {
    return new PartStateId(idPartState);
  }

  @JsonProperty("idPartState")
  public Integer getIdPartState() {
    return idPartState;
  }

  public void setIdPartState(Integer idPartState) {
    this.idPartState = idPartState;
  }
}