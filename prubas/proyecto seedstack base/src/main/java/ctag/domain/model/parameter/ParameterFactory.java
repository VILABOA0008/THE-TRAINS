package ctag.domain.model.parameter;


public interface ParameterFactory extends GenericFactory<Parameter> {
  
 Parameter createParameter(String name,boolean hasPoints,Integer idParameterType);

 Parameter createParameter(Integer ParameterId, String name,boolean hasPoints,Integer idParameterType);


}
