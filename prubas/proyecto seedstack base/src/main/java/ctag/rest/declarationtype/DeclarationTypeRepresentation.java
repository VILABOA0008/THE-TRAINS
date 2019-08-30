package ctag.dtos.dto.declarationtype;


import ctag.domain.model.aggregate.modelospruebas.DeclarationType;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(DeclarationType.class)
public class DeclarationTypeRepresentation {

  private Integer idDeclarationType;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdDeclarationType() {
    return idDeclarationType;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdDeclarationType(Integer idDeclarationType) {
    this.idDeclarationType = idDeclarationType;
  }
}