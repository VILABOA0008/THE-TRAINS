package ctag.dtos.dto.tot_doctype;


import ctag.domain.model.aggregate.modelospruebas.TOT_DocType;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(TOT_DocType.class)
@ApiModel(value = " TOT_DocType ")
public class TOT_DocTypeCreateDto {

  private Integer idTOT_DocType;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdTOT_DocType() {
    return idTOT_DocType;
  }

  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdTOT_DocType(Integer idTOT_DocType) {
    this.idTOT_DocType = idTOT_DocType;
  }
}