package ctag.domain.model.linetype;

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
@Table(name = LineType.TABLE_NAME)
@IdClass(LineTypeId.class)
public class LineType extends BaseAggregateRoot<LineTypeId> {
   
public static final String TABLE_NAME = "LineType";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_LINETYPE = " idLineType ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_ACTIVE = "Active";   
private static final String GENERATOR = "LineTypeGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_LINETYPE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_ACTIVE,unique = false,  nullable = false)
  private boolean active;

  LineType() {
    // Required by Hibernate
  }



  @Override
  public LineTypeId getId() {
    return new LineTypeId(id);
  }

  public String getName() {
    return name;
  }
  public boolean getActive() {
    return active;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setActive(boolean active) {
    this.active = active;
  }


}