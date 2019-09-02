package ctag.domain.model.tot_style;

import org.seedstack.business.domain.Factory;

public interface Tot_styleFactory extends Factory<Tot_style> {
  
 Tot_style createTot_style(String name,String styleClass);


}
