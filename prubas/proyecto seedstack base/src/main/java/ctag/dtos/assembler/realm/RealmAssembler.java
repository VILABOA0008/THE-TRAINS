  package ctag.dtos.assembler.realm;

import javax.inject.Inject; 
import org.seedstack.business.assembler.Assembler;
import org.seedstack.business.assembler.BaseAssembler;

public class RealmAssembler extends BaseAssembler<Realm, RealmDto> {

  private final Assembler<Realm, RealmCreateDto> assembler;

  @Inject
  public RealmAssembler(
      Assembler<Realm, RealmCreateDto> assembler) {
    this.assembler = assembler;
  }

  @Override
  public void mergeAggregateIntoDto(Realm sourceAggregate, RealmDto targetDto) {
    assembler.mergeAggregateIntoDto(sourceAggregate, targetDto);
    targetDto.setIdRealm(sourceAggregate.getId().getId());
  }

  @Override
  public void mergeDtoIntoAggregate(RealmDto sourceDto, Realm targetAggregate) {
    assembler.mergeDtoIntoAggregate(sourceDto, targetAggregate);

  }

}
