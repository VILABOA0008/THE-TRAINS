package ctag.dtos.dto.psashift;


import ctag.domain.model.aggregate.modelospruebas.PsaShift;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(PsaShift.class)
public class PsaShiftRepresentation {

  private Integer idPsaShift;
private String name;
private boolean active;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdPsaShift() {
    return idPsaShift;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

 @MatchingFactoryParameter(index = 2)
  public boolean getActive() {
    return active;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setActive(boolean  active) {
    this.active = active;  }

  public void setIdPsaShift(Integer idPsaShift) {
    this.idPsaShift = idPsaShift;
  }
}