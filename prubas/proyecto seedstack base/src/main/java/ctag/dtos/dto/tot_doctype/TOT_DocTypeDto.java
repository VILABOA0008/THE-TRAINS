package ctag.dtos.dto.tot_doctype;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Tot_doctype  ")public class Tot_doctypeDto extends Tot_doctypeCreateDto {

  private Integer idTot_doctype;

  @JsonIgnore
@AggregateId
  private Tot_doctypeId getId() {
    return new Tot_doctypeId(idTot_doctype);
  }

  @JsonProperty("idTot_doctype")
  public Integer getIdTot_doctype() {
    return idTot_doctype;
  }

  public void setIdTot_doctype(Integer idTot_doctype) {
    this.idTot_doctype = idTot_doctype;
  }
}