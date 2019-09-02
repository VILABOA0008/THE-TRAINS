package ctag.dtos.dto.tot_button;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Tot_button  ")public class Tot_buttonDto extends Tot_buttonCreateDto {

  private Integer idTot_button;

  @JsonIgnore
@AggregateId
  private Tot_buttonId getId() {
    return new Tot_buttonId(idTot_button);
  }

  @JsonProperty("idTot_button")
  public Integer getIdTot_button() {
    return idTot_button;
  }

  public void setIdTot_button(Integer idTot_button) {
    this.idTot_button = idTot_button;
  }
}