package ctag.dtos.dto.bom;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Bom  ")public class BomDto extends BomCreateDto {

  private Integer idBom;

  @JsonIgnore
@AggregateId
  private BomId getId() {
    return new BomId(idBom);
  }

  @JsonProperty("idBom")
  public Integer getIdBom() {
    return idBom;
  }

  public void setIdBom(Integer idBom) {
    this.idBom = idBom;
  }
}