package ctag.dtos.dto.sourcematerialtype;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " SourceMaterialType  ")public class SourceMaterialTypeDto extends SourceMaterialTypeCreateDto {

  private Integer idSourceMaterialType;

  @JsonIgnore
@AggregateId
  private SourceMaterialTypeId getId() {
    return new SourceMaterialTypeId(idSourceMaterialType);
  }

  @JsonProperty("idSourceMaterialType")
  public Integer getIdSourceMaterialType() {
    return idSourceMaterialType;
  }

  public void setIdSourceMaterialType(Integer idSourceMaterialType) {
    this.idSourceMaterialType = idSourceMaterialType;
  }
}