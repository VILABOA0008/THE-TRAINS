package ctag.dtos.dto.tot_style;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Tot_style  ")public class Tot_styleDto extends Tot_styleCreateDto {

  private Integer idTot_style;

  @JsonIgnore
@AggregateId
  private Tot_styleId getId() {
    return new Tot_styleId(idTot_style);
  }

  @JsonProperty("idTot_style")
  public Integer getIdTot_style() {
    return idTot_style;
  }

  public void setIdTot_style(Integer idTot_style) {
    this.idTot_style = idTot_style;
  }
}