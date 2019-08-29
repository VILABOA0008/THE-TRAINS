package ctag.domain.model.tot_style;


public interface TOT_StyleFactory extends GenericFactory<TOT_Style> {
  
 TOT_Style createTOT_Style(String name,String styleClass);

 TOT_Style createTOT_Style(Integer TOT_StyleId, String name,String styleClass);


}
