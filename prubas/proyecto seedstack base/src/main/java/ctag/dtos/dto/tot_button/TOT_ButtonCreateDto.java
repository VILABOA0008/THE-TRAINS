package ctag.dtos.dto.tot_button;


import ctag.domain.model.aggregate.modelospruebas.Tot_button;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Tot_button.class)
@ApiModel(value = " Tot_button ")
public class Tot_buttonCreateDto {

private String shortName;
private Integer order;
private String name;
private Integer x;
private Integer y;
private Integer w;
private Integer h;
private boolean active;
private Integer idTOT_Page;


  @JsonProperty(value = "shortName")
  @ApiModelProperty(value = "shortName")
  @FactoryArgument(index = 0)
  public String getShortName() {
    return shortName;  }

  @JsonProperty(value = "order")
  @ApiModelProperty(value = "order")
  @FactoryArgument(index = 1)
  public Integer getOrder() {
    return order;  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 2)
  public String getName() {
    return name;  }

  @JsonProperty(value = "x")
  @ApiModelProperty(value = "x")
  @FactoryArgument(index = 3)
  public Integer getX() {
    return x;  }

  @JsonProperty(value = "y")
  @ApiModelProperty(value = "y")
  @FactoryArgument(index = 4)
  public Integer getY() {
    return y;  }

  @JsonProperty(value = "w")
  @ApiModelProperty(value = "w")
  @FactoryArgument(index = 5)
  public Integer getW() {
    return w;  }

  @JsonProperty(value = "h")
  @ApiModelProperty(value = "h")
  @FactoryArgument(index = 6)
  public Integer getH() {
    return h;  }

  @JsonProperty(value = "active")
  @ApiModelProperty(value = "active")
  @FactoryArgument(index = 7)
  public boolean getActive() {
    return active;  }

  @JsonProperty(value = "idTOT_Page")
  @ApiModelProperty(value = "idTOT_Page") 
  @FactoryArgument(index = 8)
  public Integer getIdTOT_Page() {
    return idTOT_Page;  }

  public void setShortName(String  shortName) {
    this.shortName = shortName;  }

  public void setOrder(Integer  order) {
    this.order = order;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setX(Integer  x) {
    this.x = x;  }

  public void setY(Integer  y) {
    this.y = y;  }

  public void setW(Integer  w) {
    this.w = w;  }

  public void setH(Integer  h) {
    this.h = h;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setIdTOT_Page(Integer  idTOT_Page) {
    this.idTOT_Page = idTOT_Page;  }


}