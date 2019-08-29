package ctag.domain.model.design;


public interface DesignFactory extends GenericFactory<Design> {
  
 Design createDesign(String name,String code);

 Design createDesign(Integer DesignId, String name,String code);


}
