package ctag.domain.model.linetype;


public interface LineTypeFactory extends GenericFactory<LineType> {
  
 LineType createLineType(String name,boolean active);

 LineType createLineType(Integer LineTypeId, String name,boolean active);


}
