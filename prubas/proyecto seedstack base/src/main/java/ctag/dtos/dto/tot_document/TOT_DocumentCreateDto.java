package ctag.dtos.dto.tot_document;


import ctag.domain.model.aggregate.modelospruebas.TOT_Document;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(TOT_Document.class)
@ApiModel(value = " TOT_Document ")
public class TOT_DocumentCreateDto {

private String name;
private String link;
private Integer idTOT_DocType;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "link")
  @ApiModelProperty(value = "link")
  @FactoryArgument(index = 1)
  public String getLink() {
    return link;  }

  @JsonProperty(value = "idTOT_DocType")
  @ApiModelProperty(value = "idTOT_DocType") 
  @FactoryArgument(index = 2)
  public Integer getIdTOT_DocType() {
    return idTOT_DocType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setLink(String  link) {
    this.link = link;  }

  public void setIdTOT_DocType(Integer  idTOT_DocType) {
    this.idTOT_DocType = idTOT_DocType;  }


}