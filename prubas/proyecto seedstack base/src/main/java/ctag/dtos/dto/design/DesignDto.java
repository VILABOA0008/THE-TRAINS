package ctag.dtos.dto.design;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Design  ")public class DesignDto extends DesignCreateDto {

  private Integer idDesign;

  @JsonIgnore
@AggregateId
  private DesignId getId() {
    return new DesignId(idDesign);
  }

  @JsonProperty("idDesign")
  public Integer getIdDesign() {
    return idDesign;
  }

  public void setIdDesign(Integer idDesign) {
    this.idDesign = idDesign;
  }
}