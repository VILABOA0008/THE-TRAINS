package ctag.domain.model.processvigilancestate;


public interface ProcessVigilanceStateFactory extends GenericFactory<ProcessVigilanceState> {
  
 ProcessVigilanceState createProcessVigilanceState(String name);

 ProcessVigilanceState createProcessVigilanceState(Integer ProcessVigilanceStateId, String name);


}
