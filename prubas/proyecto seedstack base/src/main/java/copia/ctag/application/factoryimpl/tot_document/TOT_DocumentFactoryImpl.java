package ctag.application.factoryimpl.tot_document;


import ctag.domain.model.tOT_Document.*;

import org.seedstack.business.domain.BaseFactory; 

public class TOT_DocumentFactoryImpl extends BaseFactory<TOT_Document> implements TOT_DocumentFactory {

  @Override
  public TOT_Document createTOT_Document(String name,String link,Integer idTOT_DocType) {

    TOT_Document tmpTOT_Document = create();


  tmpTOT_Document.setName(name);
  tmpTOT_Document.setLink(link);
  tmpTOT_Document.setIdTOT_DocType(new TOT_DocTypeId(idTOT_DocType));

    return tmpTOT_Document;
  }

}
