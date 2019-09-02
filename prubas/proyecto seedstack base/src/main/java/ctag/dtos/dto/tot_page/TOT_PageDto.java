package ctag.dtos.dto.tot_page;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Tot_page  ")public class Tot_pageDto extends Tot_pageCreateDto {

  private Integer idTot_page;

  @JsonIgnore
@AggregateId
  private Tot_pageId getId() {
    return new Tot_pageId(idTot_page);
  }

  @JsonProperty("idTot_page")
  public Integer getIdTot_page() {
    return idTot_page;
  }

  public void setIdTot_page(Integer idTot_page) {
    this.idTot_page = idTot_page;
  }
}