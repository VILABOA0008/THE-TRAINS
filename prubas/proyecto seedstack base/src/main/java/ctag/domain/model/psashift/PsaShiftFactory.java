package ctag.domain.model.psashift;


public interface PsaShiftFactory extends GenericFactory<PsaShift> {
  
 PsaShift createPsaShift(String name,boolean active);

 PsaShift createPsaShift(Integer PsaShiftId, String name,boolean active);


}
