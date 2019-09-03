package ctag.dtos.dto.tot_doctype;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.aggregate.modelospruebas.TOT_DocType;

@DtoOf(TOT_DocType.class)
public class TOT_DocTypeRepresentation {

  private Integer idTOT_DocType;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdTOT_DocType() {
    return idTOT_DocType;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdTOT_DocType(Integer idTOT_DocType) {
    this.idTOT_DocType = idTOT_DocType;
  }
}