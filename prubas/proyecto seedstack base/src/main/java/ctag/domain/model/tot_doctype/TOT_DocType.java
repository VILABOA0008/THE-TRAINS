package ctag.domain.model.tot_doctype;

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
@Table(name = Tot_doctype.TABLE_NAME)
@IdClass(Tot_doctypeId.class)
public class Tot_doctype extends BaseAggregateRoot<Tot_doctypeId> {
   
public static final String TABLE_NAME = "TOT_DocType";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_TOT_DOCTYPE = " idTot_doctype ";
private static final String FIELD_NAME = "Name";   
private static final String MAPPED_BY_TOT__DOCTYPE = "tot_doctype";   
private static final String GENERATOR = "Tot_doctypeGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_TOT_DOCTYPE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  Tot_doctype() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_TOT__DOCTYPE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<TOT_Document> tOT_Documents;



  @Override
  public Tot_doctypeId getId() {
    return new Tot_doctypeId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Set<TOT_Document> getTOT_Documents() {
    if (tOT_Documents == null) {
      return Collections.<TOT_Document>emptySet();
    }
    return Collections.unmodifiableSet(tOT_Documents);
  }

  public void addTOT_Document(TOT_Document tOT_Document) {
    if (tOT_Documents == null) {
      this.tOT_Documents = new HashSet<>();
    }
    this.tOT_Documents.add(tOT_Document);
  }


}