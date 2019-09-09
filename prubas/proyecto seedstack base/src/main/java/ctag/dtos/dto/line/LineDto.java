package ctag.dtos.dto.line;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Line  ")public class LineDto extends LineCreateDto {

  private Integer idLine;

  @JsonIgnore
@AggregateId
  private LineId getId() {
    return new LineId(idLine);
  }

  @JsonProperty("idLine")
  public Integer getLineId() {
    return idLine;
  }

  public void setLineId(Integer idLine) {
    this.idLine = idLine;
  }
}