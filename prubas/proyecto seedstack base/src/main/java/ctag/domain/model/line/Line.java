package ctag.domain.model.line;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.seedstack.business.domain.BaseAggregateRoot;

import ctag.domain.model.tot_page.TOT_Page;

@Entity
@Table(name = Line.TABLE_NAME)
@IdClass(LineId.class)
public class Line extends BaseAggregateRoot<LineId> {
   
public static final String TABLE_NAME = "Line";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_LINE = " idLine ";
private static final String FIELD_NAME = "Name";
private static final String FIELD_ACTIVE = "Active";   
private static final String MAPPED_BY_LINE = "line";   
private static final String GENERATOR = "LineGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_LINE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  @Column(name = FIELD_ACTIVE,unique = false,  nullable = false)
  private boolean active;

  Line() {
    // Required by Hibernate
  }

  @OneToMany(mappedBy = MAPPED_BY_LINE, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<TOT_Page> tOT_Pages;



  @Override
  public LineId getId() {
    return new LineId(id);
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
  public Set<TOT_Page> getTOT_Pages() {
    if (tOT_Pages == null) {
      return Collections.<TOT_Page>emptySet();
    }
    return Collections.unmodifiableSet(tOT_Pages);
  }

  public void addTOT_Page(TOT_Page tOT_Page) {
    if (tOT_Pages == null) {
      this.tOT_Pages = new HashSet<>();
    }
    this.tOT_Pages.add(tOT_Page);
  }


}