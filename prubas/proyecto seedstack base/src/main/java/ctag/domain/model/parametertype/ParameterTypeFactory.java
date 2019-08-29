package ctag.domain.model.parametertype;


public interface ParameterTypeFactory extends GenericFactory<ParameterType> {
  
 ParameterType createParameterType(String name);

 ParameterType createParameterType(Integer ParameterTypeId, String name);


}
