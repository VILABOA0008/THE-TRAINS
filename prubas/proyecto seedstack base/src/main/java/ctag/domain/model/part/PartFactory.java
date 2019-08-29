package ctag.domain.model.part;


public interface PartFactory extends GenericFactory<Part> {
  
 Part createPart(String name,Integer idDesign,Integer idPartState);

 Part createPart(Integer PartId, String name,Integer idDesign,Integer idPartState);


}
