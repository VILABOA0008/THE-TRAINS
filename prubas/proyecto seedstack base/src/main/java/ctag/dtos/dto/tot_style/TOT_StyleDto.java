package ctag.dtos.dto.tot_style;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " TOT_Style  ")public class TOT_StyleDto extends TOT_StyleCreateDto {

  private Integer idTOT_Style;

  @JsonIgnore
@AggregateId
  private TOT_StyleId getId() {
    return new TOT_StyleId(idTOT_Style);
  }

  @JsonProperty("idTOT_Style")
  public Integer getIdTOT_Style() {
    return idTOT_Style;
  }

  public void setIdTOT_Style(Integer idTOT_Style) {
    this.idTOT_Style = idTOT_Style;
  }
}