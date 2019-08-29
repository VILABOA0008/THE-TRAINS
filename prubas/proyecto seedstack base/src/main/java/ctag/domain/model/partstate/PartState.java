package ctag.domain.model.partstate;

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
@Table(name = PartState.TABLE_NAME)
@IdClass(PartStateId.class)
public class PartState extends BaseAggregateRoot<PartStateId> {
   
public static final String TABLE_NAME = "PartState";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PARTSTATE = " idPartState ";
private static final String FIELD_NAME = "Name";   
private static final String MAPPED_BY_PART_STATE = "partState";   
private static final String GENERATOR = "PartStateGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PARTSTATE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  PartState() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_PART_STATE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Part> parts;



  @Override
  public PartStateId getId() {
    return new PartStateId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Set<Part> getParts() {
    if (parts == null) {
      return Collections.<Part>emptySet();
    }
    return Collections.unmodifiableSet(parts);
  }

  public void addPart(Part part) {
    if (parts == null) {
      this.parts = new HashSet<>();
    }
    this.parts.add(part);
  }


}