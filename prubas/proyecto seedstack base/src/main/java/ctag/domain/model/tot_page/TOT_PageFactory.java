package ctag.domain.model.tot_page;


public interface TOT_PageFactory extends GenericFactory<TOT_Page> {
  
 TOT_Page createTOT_Page(String name,Integer order,boolean active);

 TOT_Page createTOT_Page(Integer TOT_PageId, String name,Integer order,boolean active);


}
