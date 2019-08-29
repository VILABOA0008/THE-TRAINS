package ctag.dtos.dto.psashift;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " PsaShift  ")public class PsaShiftDto extends PsaShiftCreateDto {

  private Integer idPsaShift;

  @JsonIgnore
@AggregateId
  private PsaShiftId getId() {
    return new PsaShiftId(idPsaShift);
  }

  @JsonProperty("idPsaShift")
  public Integer getIdPsaShift() {
    return idPsaShift;
  }

  public void setIdPsaShift(Integer idPsaShift) {
    this.idPsaShift = idPsaShift;
  }
}