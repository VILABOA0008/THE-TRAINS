package ctag.domain.model.launchdeclarations;


public interface LaunchDeclarationsFactory extends GenericFactory<LaunchDeclarations> {
  
 LaunchDeclarations createLaunchDeclarations(Integer idDeclarationType,Integer quantity,Integer idDeclarationType);

 LaunchDeclarations createLaunchDeclarations(Integer LaunchDeclarationsId, Integer idDeclarationType,Integer quantity,Integer idDeclarationType);


}
