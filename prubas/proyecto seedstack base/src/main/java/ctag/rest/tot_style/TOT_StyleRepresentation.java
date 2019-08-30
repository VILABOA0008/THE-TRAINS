package ctag.dtos.dto.tot_style;


import ctag.domain.model.aggregate.modelospruebas.TOT_Style;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(TOT_Style.class)
public class TOT_StyleRepresentation {

  private Integer idTOT_Style;
private String name;
private String styleClass;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdTOT_Style() {
    return idTOT_Style;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

 @MatchingFactoryParameter(index = 2)
  public String getStyleClass() {
    return styleClass;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setStyleClass(String  styleClass) {
    this.styleClass = styleClass;  }

  public void setIdTOT_Style(Integer idTOT_Style) {
    this.idTOT_Style = idTOT_Style;
  }
}