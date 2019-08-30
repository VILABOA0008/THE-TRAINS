package ctag.domain.model.tot_page;

import org.seedstack.business.domain.Factory;

public interface TOT_PageFactory extends Factory<TOT_Page> {
  
 TOT_Page createTOT_Page(String name,Integer order,boolean active,Integer idLine);


}
