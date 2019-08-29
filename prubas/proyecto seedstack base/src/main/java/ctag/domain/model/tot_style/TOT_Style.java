package ctag.domain.model.tot_style;

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
@Table(name = TOT_Style.TABLE_NAME)
@IdClass(TOT_StyleId.class)
public class TOT_Style extends BaseAggregateRoot<TOT_StyleId> {
   
public static final String TABLE_NAME = "TOT_Style";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_TOT_STYLE = " idTOT_Style ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_STYLE_CLASS = "Style_Class";   
private static final String GENERATOR = "TOT_StyleGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_TOT_STYLE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_STYLE_CLASS,unique = false,  nullable = false)
  private String styleClass;

  TOT_Style() {
    // Required by Hibernate
  }



  @Override
  public TOT_StyleId getId() {
    return new TOT_StyleId(id);
  }

  public String getName() {
    return name;
  }
  public String getStyleClass() {
    return styleClass;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setStyleClass(String styleClass) {
    this.styleClass = styleClass;
  }


}