package ctag.dtos.dto.tot_doctype;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " TOT_DocType  ")public class TOT_DocTypeDto extends TOT_DocTypeCreateDto {

  private Integer idTOT_DocType;

  @JsonIgnore
@AggregateId
  private TOT_DocTypeId getId() {
    return new TOT_DocTypeId(idTOT_DocType);
  }

  @JsonProperty("idTOT_DocType")
  public Integer getIdTOT_DocType() {
    return idTOT_DocType;
  }

  public void setIdTOT_DocType(Integer idTOT_DocType) {
    this.idTOT_DocType = idTOT_DocType;
  }
}