package ctag.dtos.dto.tot_document;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Tot_document  ")public class Tot_documentDto extends Tot_documentCreateDto {

  private Integer idTot_document;

  @JsonIgnore
@AggregateId
  private Tot_documentId getId() {
    return new Tot_documentId(idTot_document);
  }

  @JsonProperty("idTot_document")
  public Integer getIdTot_document() {
    return idTot_document;
  }

  public void setIdTot_document(Integer idTot_document) {
    this.idTot_document = idTot_document;
  }
}