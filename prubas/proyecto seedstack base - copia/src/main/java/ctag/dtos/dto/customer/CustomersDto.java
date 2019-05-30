package ctag.dtos.dto.customer;


import org.seedstack.business.assembler.AggregateId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(value = " Customers  ")public class CustomersDto extends CustomersCreateDto {

  private Integer idCustomers;

  @JsonIgnore
@AggregateId
  private CustomersId getId() {
    return new CustomersId(idCustomers);
  }

  @JsonProperty("idCustomers")
  public Integer getIdCustomers() {
    return idCustomers;
  }

  public void setIdCustomers(Integer idCustomers) {
    this.idCustomers = idCustomers;
  }
}