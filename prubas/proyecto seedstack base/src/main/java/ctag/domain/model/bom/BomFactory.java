package ctag.domain.model.bom;


public interface BomFactory extends GenericFactory<Bom> {
  
 Bom createBom(,Integer idDesign);

 Bom createBom(Integer BomId, ,Integer idDesign);


}
