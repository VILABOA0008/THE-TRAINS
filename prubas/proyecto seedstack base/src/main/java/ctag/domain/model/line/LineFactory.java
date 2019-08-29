package ctag.domain.model.line;


public interface LineFactory extends GenericFactory<Line> {
  
 Line createLine(String name,Integer idLineType);

 Line createLine(Integer LineId, String name,Integer idLineType);


}
