package ctag.interfaces.rest;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.seedstack.jpa.Jpa;
import org.seedstack.jpa.JpaUnit;
import org.seedstack.seed.transaction.Transactional;

@Path("hello")
public class HelloResource {
  @GET
  public String hello() {
    return "Hello World!";
  }

  @Inject
  private EntityManager em;

  @Transactional
  @JpaUnit("myUnit")
  @Jpa
  @Path("bye")
  @GET
  public String bye() {
    // Employee a= em.find(Employee.class, 2);

    // em.persist(new Employee("2323EL ",122,132322f));

    return "dsadsads";
  }
}
