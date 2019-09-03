package ctag.dtos.dto.bom;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.bom.Bom;

@DtoOf(Bom.class)
public class BomRepresentation {

  private Integer idBom;
private Integer idDesign;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdBom() {
    return idBom;
  }

  @MatchingFactoryParameter(index = 1)
  public Integer getIdDesign() {
    return idDesign;  }

  public void setIdBom(Integer idBom) {
    this.idBom = idBom;
  }  public void setIdDesign(Integer  idDesign) {
    this.idDesign = idDesign;  }


}