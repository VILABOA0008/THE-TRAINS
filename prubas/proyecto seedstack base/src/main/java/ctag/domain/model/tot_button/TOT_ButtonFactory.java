package ctag.domain.model.tot_button;

import org.seedstack.business.domain.Factory;

public interface Tot_buttonFactory extends Factory<Tot_button> {
  
 Tot_button createTot_button(Integer page,String shortName,Integer order,String name,Integer x,Integer y,Integer w,Integer h,boolean active,Integer idTOT_Page);


}
