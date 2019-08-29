package ctag.dtos.dto.bomasd;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Bomasd  ")public class BomasdDto extends BomasdCreateDto {

  private Integer idBomasd;

  @JsonIgnore
@AggregateId
  private BomasdId getId() {
    return new BomasdId(idBomasd);
  }

  @JsonProperty("idBomasd")
  public Integer getIdBomasd() {
    return idBomasd;
  }

  public void setIdBomasd(Integer idBomasd) {
    this.idBomasd = idBomasd;
  }
}