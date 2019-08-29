package ctag.domain.model.tot_doctype;


public interface TOT_DocTypeFactory extends GenericFactory<TOT_DocType> {
  
 TOT_DocType createTOT_DocType(String name);

 TOT_DocType createTOT_DocType(Integer TOT_DocTypeId, String name);


}
