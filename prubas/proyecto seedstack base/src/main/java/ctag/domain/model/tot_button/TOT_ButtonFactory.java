package ctag.domain.model.tot_button;

import org.seedstack.business.domain.Factory;

public interface TOT_ButtonFactory extends Factory<TOT_Button> {
  
 TOT_Button createTOT_Button(String name,String shortName,Integer x,Integer y,Integer w,Integer h,boolean active,Integer order,Integer idTOT_Page);


}
