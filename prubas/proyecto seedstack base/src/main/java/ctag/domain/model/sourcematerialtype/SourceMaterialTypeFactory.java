package ctag.domain.model.sourcematerialtype;


public interface SourceMaterialTypeFactory extends GenericFactory<SourceMaterialType> {
  
 SourceMaterialType createSourceMaterialType(String name);

 SourceMaterialType createSourceMaterialType(Integer SourceMaterialTypeId, String name);


}
