package ctag.dtos.dto.launchdeclarations;


import ctag.domain.model.aggregate.modelospruebas.LaunchDeclarations;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(LaunchDeclarations.class)
@ApiModel(value = " LaunchDeclarations ")
public class LaunchDeclarationsCreateDto {

  private Integer idLaunchDeclarations;
private Integer idDeclarationType;
private Integer quantity;
private Integer idDeclarationType;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdLaunchDeclarations() {
    return idLaunchDeclarations;
  }

  @JsonProperty(value = "idDeclarationType")
  @ApiModelProperty(value = "idDeclarationType")
  @FactoryArgument(index = 0)
  public Integer getIdDeclarationType() {
    return idDeclarationType;  }

  @JsonProperty(value = "quantity")
  @ApiModelProperty(value = "quantity")
  @FactoryArgument(index = 1)
  public Integer getQuantity() {
    return quantity;  }

  @MatchingFactoryParameter(index = 2)
  public Integer getIdDeclarationType() {
    return idDeclarationType;  }

  public void setIdDeclarationType(Integer  idDeclarationType) {
    this.idDeclarationType = idDeclarationType;  }

  public void setQuantity(Integer  quantity) {
    this.quantity = quantity;  }

  public void setIdLaunchDeclarations(Integer idLaunchDeclarations) {
    this.idLaunchDeclarations = idLaunchDeclarations;
  }  public void setIdDeclarationType(Integer  idDeclarationType) {
    this.idDeclarationType = idDeclarationType;  }


}