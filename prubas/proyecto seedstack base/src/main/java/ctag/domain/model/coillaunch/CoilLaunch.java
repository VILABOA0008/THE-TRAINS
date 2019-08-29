package ctag.domain.model.coillaunch;

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
@Table(name = CoilLaunch.TABLE_NAME)
@IdClass(CoilLaunchId.class)
public class CoilLaunch extends BaseAggregateRoot<CoilLaunchId> {
   
public static final String TABLE_NAME = "CoilLaunch";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_COILLAUNCH = " idCoilLaunch ";
private static final String FIELD_COIL_NUMBER = "Coil_Number";   
public static final String FK_PROCESSLAUNCH = "FK_ProcessLaunch";   
private static final String GENERATOR = "CoilLaunchGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_COILLAUNCH, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_COIL_NUMBER,unique = false,  nullable = false)
  private String coilNumber;

  CoilLaunch() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_PROCESSLAUNCH, nullable = false, insertable = false, updatable = false)
  private ProcessLaunch processLaunch;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_PROCESSLAUNCH, nullable = true))
  private ProcessLaunchId  idProcessLaunch;




  @Override
  public CoilLaunchId getId() {
    return new CoilLaunchId(id);
  }

  public String getCoilNumber() {
    return coilNumber;
  }
  public void setCoilNumber(String coilNumber) {
    this.coilNumber = coilNumber;
  }
   public ProcessLaunch getProcessLaunch() {
    return processLaunch;
  }
  public ProcessLaunchId getIdProcessLaunch() {
    return idProcessLaunch;
  }
  public void setIdProcessLaunch(ProcessLaunchId idProcessLaunch) {
    this.idProcessLaunch = idProcessLaunch;
  }


}