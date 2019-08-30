package ctag.dtos.dto.tot_button;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " TOT_Button  ")public class TOT_ButtonDto extends TOT_ButtonCreateDto {

  private Integer idTOT_Button;

  @JsonIgnore
@AggregateId
  private TOT_ButtonId getId() {
    return new TOT_ButtonId(idTOT_Button);
  }

  @JsonProperty("idTOT_Button")
  public Integer getIdTOT_Button() {
    return idTOT_Button;
  }

  public void setIdTOT_Button(Integer idTOT_Button) {
    this.idTOT_Button = idTOT_Button;
  }
}