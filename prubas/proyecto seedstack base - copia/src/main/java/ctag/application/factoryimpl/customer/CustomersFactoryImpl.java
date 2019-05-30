package ctag.application.factoryimpl.customer;

import org.seedstack.business.domain.BaseFactory;

import ctag.domain.model.aggregate.modelospruebas.Customers;
import ctag.domain.model.aggregate.modelospruebas.CustomersFactory;
import ctag.domain.model.aggregate.modelospruebas.PageId;
import ctag.domain.model.aggregate.modelospruebas.StyleId;

public class CustomersFactoryImpl extends BaseFactory<Customers> implements CustomersFactory {

  @Override
  public Customers createCustomers(
      String name, String username, Integer age, Integer idStyle, Integer idPage) {

    Customers tmpCustomers = create();

    tmpCustomers.setName(name);
    tmpCustomers.setUsername(username);
    tmpCustomers.setAge(age);
    tmpCustomers.setIdStyle(new StyleId(idStyle));
    tmpCustomers.setIdPage(new PageId(idPage));

    return tmpCustomers;
  }
}
