package ctag.application.factoryimpl.design;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.seedstack.business.domain.BaseFactory;

import ctag.domain.model.design.Design;
import ctag.domain.model.design.DesignFactory; 

public class DesignFactoryImpl extends BaseFactory<Design> implements DesignFactory {

  @Override
  public Design createDesign(String name,String code) {
    Connection connection;
    String query="";
    Statement stmt = connection.createStatement();
    ResultSet resultSet = stmt.executeQuery(query);
    Design tmpDesign = create();


  tmpDesign.setName(name);
  tmpDesign.setCode(code);

    return tmpDesign;
  }

}
