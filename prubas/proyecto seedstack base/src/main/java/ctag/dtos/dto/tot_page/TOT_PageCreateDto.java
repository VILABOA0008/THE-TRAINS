package ctag.dtos.dto.tot_page;


import ctag.domain.model.aggregate.modelospruebas.Tot_page;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Tot_page.class)
@ApiModel(value = " Tot_page ")
public class Tot_pageCreateDto {

private Integer line;
private String name;
private Integer order;
private boolean active;
private Integer rows;
private Integer idLine;


  @JsonProperty(value = "line")
  @ApiModelProperty(value = "line")
  @FactoryArgument(index = 0)
  public Integer getLine() {
    return line;  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 1)
  public String getName() {
    return name;  }

  @JsonProperty(value = "order")
  @ApiModelProperty(value = "order")
  @FactoryArgument(index = 2)
  public Integer getOrder() {
    return order;  }

  @JsonProperty(value = "active")
  @ApiModelProperty(value = "active")
  @FactoryArgument(index = 3)
  public boolean getActive() {
    return active;  }

  @JsonProperty(value = "rows")
  @ApiModelProperty(value = "rows")
  @FactoryArgument(index = 4)
  public Integer getRows() {
    return rows;  }

  @JsonProperty(value = "idLine")
  @ApiModelProperty(value = "idLine") 
  @FactoryArgument(index = 5)
  public Integer getIdLine() {
    return idLine;  }

  public void setLine(Integer  line) {
    this.line = line;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setOrder(Integer  order) {
    this.order = order;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setRows(Integer  rows) {
    this.rows = rows;  }

  public void setIdLine(Integer  idLine) {
    this.idLine = idLine;  }


}