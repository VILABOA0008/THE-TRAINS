package ctag.dtos.dto.realm;


import ctag.domain.model.aggregate.modelospruebas.Realm;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Realm.class)
@ApiModel(value = " Realm ")
public class RealmCreateDto {

private String name;
private boolean hasAuth;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "hasAuth")
  @ApiModelProperty(value = "hasAuth")
  @FactoryArgument(index = 1)
  public boolean getHasAuth() {
    return hasAuth;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setHasAuth(boolean  hasAuth) {
    this.hasAuth = hasAuth;  }


}