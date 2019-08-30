package ctag.dtos.dto.line;


import ctag.domain.model.aggregate.modelospruebas.Line;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Line.class)
public class LineRepresentation {

  private Integer idLine;
private String name;
private Integer idLineType;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdLine() {
    return idLine;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  @MatchingFactoryParameter(index = 2)
  public Integer getIdLineType() {
    return idLineType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdLine(Integer idLine) {
    this.idLine = idLine;
  }  public void setIdLineType(Integer  idLineType) {
    this.idLineType = idLineType;  }


}