package ctag.dtos.dto.tot_document;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " TOT_Document  ")public class TOT_DocumentDto extends TOT_DocumentCreateDto {

  private Integer idTOT_Document;

  @JsonIgnore
@AggregateId
  private TOT_DocumentId getId() {
    return new TOT_DocumentId(idTOT_Document);
  }

  @JsonProperty("idTOT_Document")
  public Integer getIdTOT_Document() {
    return idTOT_Document;
  }

  public void setIdTOT_Document(Integer idTOT_Document) {
    this.idTOT_Document = idTOT_Document;
  }
}