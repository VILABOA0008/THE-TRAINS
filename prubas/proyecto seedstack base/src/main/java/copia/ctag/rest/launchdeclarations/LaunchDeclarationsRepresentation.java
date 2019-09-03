package ctag.dtos.dto.launchdeclarations;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.launchdeclarations.LaunchDeclarations;

@DtoOf(LaunchDeclarations.class)
public class LaunchDeclarationsRepresentation {

  private Integer idLaunchDeclarations;
private Integer idDeclarationType;
private Integer quantity;
private Integer idDeclarationType;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdLaunchDeclarations() {
    return idLaunchDeclarations;
  }

 @MatchingFactoryParameter(index = 1)
  public Integer getIdDeclarationType() {
    return idDeclarationType;  }

 @MatchingFactoryParameter(index = 2)
  public Integer getQuantity() {
    return quantity;  }

  @MatchingFactoryParameter(index = 3)
  public Integer getIdDeclarationType() {
    return idDeclarationType;  }

  public void setIdDeclarationType(Integer  idDeclarationType) {
    this.idDeclarationType = idDeclarationType;  }

  public void setQuantity(Integer  quantity) {
    this.quantity = quantity;  }

  public void setIdLaunchDeclarations(Integer idLaunchDeclarations) {
    this.idLaunchDeclarations = idLaunchDeclarations;
  }  public void setIdDeclarationType(Integer  idDeclarationType) {
    this.idDeclarationType = idDeclarationType;  }


}