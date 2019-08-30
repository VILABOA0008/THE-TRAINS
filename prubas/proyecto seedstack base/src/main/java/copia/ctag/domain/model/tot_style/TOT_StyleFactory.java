package ctag.domain.model.tot_style;

import org.seedstack.business.domain.Factory;

public interface TOT_StyleFactory extends Factory<TOT_Style> {
  
 TOT_Style createTOT_Style(String name,String styleClass);


}
