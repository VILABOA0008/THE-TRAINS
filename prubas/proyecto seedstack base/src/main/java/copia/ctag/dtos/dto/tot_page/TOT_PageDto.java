package ctag.dtos.dto.tot_page;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " TOT_Page  ")public class TOT_PageDto extends TOT_PageCreateDto {

  private Integer idTOT_Page;

  @JsonIgnore
@AggregateId
  private TOT_PageId getId() {
    return new TOT_PageId(idTOT_Page);
  }

  @JsonProperty("idTOT_Page")
  public Integer getIdTOT_Page() {
    return idTOT_Page;
  }

  public void setIdTOT_Page(Integer idTOT_Page) {
    this.idTOT_Page = idTOT_Page;
  }
}