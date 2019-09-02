package ctag.domain.model.tot_document;

import org.seedstack.business.domain.Factory;

public interface Tot_documentFactory extends Factory<Tot_document> {
  
 Tot_document createTot_document(Integer docType,String name,String link,Integer position,Integer idTOT_DocType);


}
