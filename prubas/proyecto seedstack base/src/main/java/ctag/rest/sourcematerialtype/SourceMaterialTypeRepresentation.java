package ctag.dtos.dto.sourcematerialtype;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.aggregate.modelospruebas.SourceMaterialType;

@DtoOf(SourceMaterialType.class)
public class SourceMaterialTypeRepresentation {

  private Integer idSourceMaterialType;
private String name;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdSourceMaterialType() {
    return idSourceMaterialType;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdSourceMaterialType(Integer idSourceMaterialType) {
    this.idSourceMaterialType = idSourceMaterialType;
  }
}