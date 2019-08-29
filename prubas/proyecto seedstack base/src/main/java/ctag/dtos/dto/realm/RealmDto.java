package ctag.dtos.dto.realm;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Realm  ")public class RealmDto extends RealmCreateDto {

  private Integer idRealm;

  @JsonIgnore
@AggregateId
  private RealmId getId() {
    return new RealmId(idRealm);
  }

  @JsonProperty("idRealm")
  public Integer getIdRealm() {
    return idRealm;
  }

  public void setIdRealm(Integer idRealm) {
    this.idRealm = idRealm;
  }
}