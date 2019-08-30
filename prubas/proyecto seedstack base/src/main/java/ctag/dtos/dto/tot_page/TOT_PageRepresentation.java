package ctag.dtos.dto.tot_page;


import ctag.domain.model.aggregate.modelospruebas.TOT_Page;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(TOT_Page.class)
@ApiModel(value = " TOT_Page ")
public class TOT_PageCreateDto {

  private Integer idTOT_Page;
private String name;
private Integer order;
private boolean active;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdTOT_Page() {
    return idTOT_Page;
  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "order")
  @ApiModelProperty(value = "order")
  @FactoryArgument(index = 1)
  public Integer getOrder() {
    return order;  }

  @JsonProperty(value = "active")
  @ApiModelProperty(value = "active")
  @FactoryArgument(index = 2)
  public boolean getActive() {
    return active;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setOrder(Integer  order) {
    this.order = order;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setIdTOT_Page(Integer idTOT_Page) {
    this.idTOT_Page = idTOT_Page;
  }
}