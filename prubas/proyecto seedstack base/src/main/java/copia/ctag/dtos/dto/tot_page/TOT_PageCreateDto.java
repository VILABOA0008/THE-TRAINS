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

private String name;
private Integer order;
private boolean active;
private Integer idLine;


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

  @JsonProperty(value = "idLine")
  @ApiModelProperty(value = "idLine") 
  @FactoryArgument(index = 3)
  public Integer getIdLine() {
    return idLine;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setOrder(Integer  order) {
    this.order = order;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setIdLine(Integer  idLine) {
    this.idLine = idLine;  }


}