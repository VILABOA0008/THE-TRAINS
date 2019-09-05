package ctag.domain.model.line;

import org.seedstack.business.domain.Factory;

public interface LineFactory extends Factory<Line> {
  
 Line createLine(String name,Integer fK_Plant,Integer fK_Group,Integer idLineType);


}
