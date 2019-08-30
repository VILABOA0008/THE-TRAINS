package ctag.domain.model.launchdeclarations;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import org.seedstack.business.domain.BaseAggregateRoot;

@Entity
@Table(name = LaunchDeclarations.TABLE_NAME)
@IdClass(LaunchDeclarationsId.class)
public class LaunchDeclarations extends BaseAggregateRoot<LaunchDeclarationsId> {
   
public static final String TABLE_NAME = "LaunchDeclarations";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_LAUNCHDECLARATIONS = " idLaunchDeclarations ";
private static final String FIELD_ID_DECLARATION_TYPE = "Id_Declaration_Type";
private static final String FIELD_QUANTITY = "Quantity";   
public static final String IDDECLARATIONTYPE = "IdDeclarationType";   
private static final String GENERATOR = "LaunchDeclarationsGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_LAUNCHDECLARATIONS, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_ID_DECLARATION_TYPE,unique = false,  nullable = false)
  private Integer idDeclarationType;

  @Column(name = FIELD_QUANTITY,unique = false,  nullable = false)
  private Integer quantity;

  LaunchDeclarations() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = IDDECLARATIONTYPE, nullable = false, insertable = false, updatable = false)
  private DeclarationType declarationType;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = IDDECLARATIONTYPE, nullable = true))
  private DeclarationTypeId  idDeclarationType;




  @Override
  public LaunchDeclarationsId getId() {
    return new LaunchDeclarationsId(id);
  }

  public Integer getIdDeclarationType() {
    return idDeclarationType;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setIdDeclarationType(Integer idDeclarationType) {
    this.idDeclarationType = idDeclarationType;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
   public DeclarationType getDeclarationType() {
    return declarationType;
  }
  public DeclarationTypeId getIdDeclarationType() {
    return idDeclarationType;
  }
  public void setIdDeclarationType(DeclarationTypeId idDeclarationType) {
    this.idDeclarationType = idDeclarationType;
  }


}