package ctag.dtos.dto.sourcematerialtype;


import ctag.domain.model.aggregate.modelospruebas.SourceMaterialType;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(SourceMaterialType.class)
@ApiModel(value = " SourceMaterialType ")
public class SourceMaterialTypeCreateDto {

  private Integer idSourceMaterialType;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdSourceMaterialType() {
    return idSourceMaterialType;
  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdSourceMaterialType(Integer idSourceMaterialType) {
    this.idSourceMaterialType = idSourceMaterialType;
  }
}