  package ctag.dtos.assembler.realm;

import org.seedstack.business.assembler.BaseAssembler;
public class RealmCreateAssembler extends BaseAssembler<Realm, RealmCreateDto> {

  @Override
  public void mergeAggregateIntoDto(Realm sourceAggregate, RealmCreateDto targetDto) {
targetDto.setName(sourceAggregate.getName());
targetDto.setHasAuth(sourceAggregate.getHasAuth());
  }

  @Override
  public void mergeDtoIntoAggregate(RealmCreateDto sourceDto,Realm targetAggregate) {
targetAggregate.setName(sourceDto.getName());
targetAggregate.setHasAuth(sourceDto.getHasAuth());

  }

}