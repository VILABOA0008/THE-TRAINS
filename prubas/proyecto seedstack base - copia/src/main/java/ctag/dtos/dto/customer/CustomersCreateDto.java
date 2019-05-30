package ctag.dtos.dto.customer;


import ctag.domain.model.aggregate.modelospruebas.Customers;
import org.seedstack.business.assembler.DtoOf; 
import org.seedstack.business.assembler.FactoryArgument;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@DtoOf(Customers.class)
@ApiModel(value = " Customers ")
public class CustomersCreateDto {

private String name;
private String username;
private Integer age;
private Integer idStyle;
private Integer idPage;


  @JsonProperty(value = "name")
  @ApiModelProperty(value = "name")
  @FactoryArgument(index = 0)
  public String getName() {
    return name;  }

  @JsonProperty(value = "username")
  @ApiModelProperty(value = "username")
  @FactoryArgument(index = 1)
  public String getUsername() {
    return username;  }

  @JsonProperty(value = "age")
  @ApiModelProperty(value = "age")
  @FactoryArgument(index = 2)
  public Integer getAge() {
    return age;  }

  @JsonProperty(value = "idStyle")
  @ApiModelProperty(value = "idStyle") 
  @FactoryArgument(index = 3)
  public Integer getIdStyle() {
    return idStyle;  }

  @JsonProperty(value = "idPage")
  @ApiModelProperty(value = "idPage") 
  @FactoryArgument(index = 4)
  public Integer getIdPage() {
    return idPage;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setUsername(String  username) {
    this.username = username;  }

  public void setAge(Integer  age) {
    this.age = age;  }

  public void setIdStyle(Integer  idStyle) {
    this.idStyle = idStyle;  }

  public void setIdPage(Integer  idPage) {
    this.idPage = idPage;  }


}