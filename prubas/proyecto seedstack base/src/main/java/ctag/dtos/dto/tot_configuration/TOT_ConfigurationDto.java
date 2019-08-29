package ctag.dtos.dto.tot_configuration;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " TOT_Configuration  ")public class TOT_ConfigurationDto extends TOT_ConfigurationCreateDto {

  private Integer idTOT_Configuration;

  @JsonIgnore
@AggregateId
  private TOT_ConfigurationId getId() {
    return new TOT_ConfigurationId(idTOT_Configuration);
  }

  @JsonProperty("idTOT_Configuration")
  public Integer getIdTOT_Configuration() {
    return idTOT_Configuration;
  }

  public void setIdTOT_Configuration(Integer idTOT_Configuration) {
    this.idTOT_Configuration = idTOT_Configuration;
  }
}