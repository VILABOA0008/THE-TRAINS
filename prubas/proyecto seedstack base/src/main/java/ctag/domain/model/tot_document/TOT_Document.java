package ctag.domain.model.tot_document;

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
@Table(name = TOT_Document.TABLE_NAME)
@IdClass(TOT_DocumentId.class)
public class TOT_Document extends BaseAggregateRoot<TOT_DocumentId> {
   
public static final String TABLE_NAME = "TOT_Document";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_TOT_DOCUMENT = " idTOT_Document ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_LINK = "Link";   
public static final String FK_DOCTYPE = "FK_DocType";   
private static final String TABLE_TOT_DOCUMENT_TOT_BUTTON = "TOT_ButtonDoc";   
private static final String ID_TOT_BUTTON = "FK_Button";   
private static final String GENERATOR = "TOT_DocumentGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_TOT_DOCUMENT, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_LINK,unique = false,  nullable = false)
  private String link;

  TOT_Document() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = FK_DOCTYPE, nullable = false, insertable = false, updatable = false)
  private TOT_DocType tOT_DocType;

  @EmbeddedId
  @AttributeOverride(name = ID  , column = @Column(name = FK_DOCTYPE, nullable = true))
  private TOT_DocTypeId  idTOT_DocType;

 
 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinTable(
      name = TABLE_TOT_DOCUMENT_TOT_BUTTON,
      joinColumns = {@JoinColumn(name = ID_TOT_DOCUMENT, nullable = false, updatable = false)},
      inverseJoinColumns = {@JoinColumn(name = ID_TOT_BUTTON, nullable = false, updatable = false)})
  private Set<TOT_Button> tOT_Buttons;



  @Override
  public TOT_DocumentId getId() {
    return new TOT_DocumentId(id);
  }

  public String getName() {
    return name;
  }
  public String getLink() {
    return link;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setLink(String link) {
    this.link = link;
  }
   public TOT_DocType getTOT_DocType() {
    return tOT_DocType;
  }
  public TOT_DocTypeId getIdTOT_DocType() {
    return idTOT_DocType;
  }
  public void setIdTOT_DocType(TOT_DocTypeId idTOT_DocType) {
    this.idTOT_DocType = idTOT_DocType;
  }


}