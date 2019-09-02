package ctag.domain.model.tot_page;

import org.seedstack.business.domain.Factory;

public interface Tot_pageFactory extends Factory<Tot_page> {
  
 Tot_page createTot_page(Integer line,String name,Integer order,boolean active,Integer rows,Integer idLine);


}
