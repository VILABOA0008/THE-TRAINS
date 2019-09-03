package ctag.dtos.dto.tot_page;


import org.seedstack.business.assembler.DtoOf;

import ctag.domain.model.aggregate.modelospruebas.TOT_Page;

@DtoOf(TOT_Page.class)
public class TOT_PageRepresentation {

  private Integer idTOT_Page;
private String name;
private Integer order;
private boolean active;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdTOT_Page() {
    return idTOT_Page;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

 @MatchingFactoryParameter(index = 2)
  public Integer getOrder() {
    return order;  }

 @MatchingFactoryParameter(index = 3)
  public boolean getActive() {
    return active;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setOrder(Integer  order) {
    this.order = order;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setIdTOT_Page(Integer idTOT_Page) {
    this.idTOT_Page = idTOT_Page;
  }
}