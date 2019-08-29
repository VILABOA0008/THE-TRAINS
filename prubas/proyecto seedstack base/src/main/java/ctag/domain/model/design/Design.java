package ctag.domain.model.design;

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
@Table(name = Design.TABLE_NAME)
@IdClass(DesignId.class)
public class Design extends BaseAggregateRoot<DesignId> {
   
public static final String TABLE_NAME = "Design";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_DESIGN = " idDesign ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_CODE = "Code";   
private static final String MAPPED_BY_DESIGN = "design";   
private static final String GENERATOR = "DesignGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_DESIGN, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_CODE,unique = false,  nullable = false)
  private String code;

  Design() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_DESIGN, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Bom> boms;



  @Override
  public DesignId getId() {
    return new DesignId(id);
  }

  public String getName() {
    return name;
  }
  public String getCode() {
    return code;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public Set<Bom> getBoms() {
    if (boms == null) {
      return Collections.<Bom>emptySet();
    }
    return Collections.unmodifiableSet(boms);
  }

  public void addBom(Bom bom) {
    if (boms == null) {
      this.boms = new HashSet<>();
    }
    this.boms.add(bom);
  }


}