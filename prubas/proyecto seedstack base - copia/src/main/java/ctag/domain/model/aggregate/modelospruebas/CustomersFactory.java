package ctag.domain.model.aggregate.modelospruebas;

import org.seedstack.business.domain.Factory;

public interface CustomersFactory extends Factory<Customers> {
  
 Customers createCustomers(String name,String username,Integer age,Integer idStyle,Integer idPage);


}
