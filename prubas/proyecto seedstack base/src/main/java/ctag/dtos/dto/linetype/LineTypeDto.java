package ctag.dtos.dto.linetype;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " LineType  ")public class LineTypeDto extends LineTypeCreateDto {

  private Integer idLineType;

  @JsonIgnore
@AggregateId
  private LineTypeId getId() {
    return new LineTypeId(idLineType);
  }

  @JsonProperty("idLineType")
  public Integer getIdLineType() {
    return idLineType;
  }

  public void setIdLineType(Integer idLineType) {
    this.idLineType = idLineType;
  }
}