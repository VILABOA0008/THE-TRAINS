package ctag.dtos.dto.part;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Part  ")public class PartDto extends PartCreateDto {

  private Integer idPart;

  @JsonIgnore
@AggregateId
  private PartId getId() {
    return new PartId(idPart);
  }

  @JsonProperty("idPart")
  public Integer getIdPart() {
    return idPart;
  }

  public void setIdPart(Integer idPart) {
    this.idPart = idPart;
  }
}