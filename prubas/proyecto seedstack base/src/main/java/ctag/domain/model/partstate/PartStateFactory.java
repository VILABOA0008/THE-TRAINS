package ctag.domain.model.partstate;


public interface PartStateFactory extends GenericFactory<PartState> {
  
 PartState createPartState(String name);

 PartState createPartState(Integer PartStateId, String name);


}
