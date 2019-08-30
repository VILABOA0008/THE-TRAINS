package ctag.domain.model.tot_document;

import org.seedstack.business.domain.Factory;

public interface TOT_DocumentFactory extends Factory<TOT_Document> {
  
 TOT_Document createTOT_Document(String name,String link,Integer idTOT_DocType);


}
