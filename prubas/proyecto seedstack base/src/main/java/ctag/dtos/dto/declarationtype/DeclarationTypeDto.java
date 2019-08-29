package ctag.dtos.dto.declarationtype;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " DeclarationType  ")public class DeclarationTypeDto extends DeclarationTypeCreateDto {

  private Integer idDeclarationType;

  @JsonIgnore
@AggregateId
  private DeclarationTypeId getId() {
    return new DeclarationTypeId(idDeclarationType);
  }

  @JsonProperty("idDeclarationType")
  public Integer getIdDeclarationType() {
    return idDeclarationType;
  }

  public void setIdDeclarationType(Integer idDeclarationType) {
    this.idDeclarationType = idDeclarationType;
  }
}