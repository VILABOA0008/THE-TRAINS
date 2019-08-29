package ctag.dtos.dto.reworkbatch;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " ReworkBatch  ")public class ReworkBatchDto extends ReworkBatchCreateDto {

  private Integer idReworkBatch;

  @JsonIgnore
@AggregateId
  private ReworkBatchId getId() {
    return new ReworkBatchId(idReworkBatch);
  }

  @JsonProperty("idReworkBatch")
  public Integer getIdReworkBatch() {
    return idReworkBatch;
  }

  public void setIdReworkBatch(Integer idReworkBatch) {
    this.idReworkBatch = idReworkBatch;
  }
}