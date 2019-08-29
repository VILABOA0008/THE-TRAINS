package ctag.domain.model.declarationtype;


public interface DeclarationTypeFactory extends GenericFactory<DeclarationType> {
  
 DeclarationType createDeclarationType(String name);

 DeclarationType createDeclarationType(Integer DeclarationTypeId, String name);


}
