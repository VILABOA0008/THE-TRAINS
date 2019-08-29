package ctag.domain.model.linetypeparameter;

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
@Table(name = LineTypeParameter.TABLE_NAME)
@IdClass(LineTypeParameterId.class)
public class LineTypeParameter extends BaseAggregateRoot<LineTypeParameterId> {
   
public static final String TABLE_NAME = "LineTypeParameter";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_LINETYPEPARAMETER = " idLineTypeParameter ";   
public static final String IDPARAMETER = "IdParameter";   
public static final String IDLINETYPE = "IdLineType";
  LineTypeParameter() {
    // Required by Hibernate
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = IDPARAMETER, nullable = false, insertable = false, updatable = false)
  private Parameter parameter;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = IDLINETYPE, nullable = false, insertable = false, updatable = false)
  private LineType lineType;
  @EmbeddedId
@AttributeOverrides( {  @AttributeOverride(name = " idParameter  ", column = @Column(name = IDPARAMETER)),
  @AttributeOverride(name = " idLineType", column = @Column(name =IDLINETYPE))})
  private LineTypeParameterId id;




  LineTypeParameter(ParameterId idParameter, LineTypeId idLineType) {
    id = new LineTypeParameterId(idParameter.getId(), idLineType.getId());
  }
  @Override
  public LineTypeParameterId getId() {
    return new LineTypeParameterId(getIdParameter().getId(), getIdLineType().getId());
  }


  public ParameterId getIdParameter() {
    return id.getParameterId();
  }
  public Parameter getParameter() {
    return parameter;
  }  public void setParameter(Parameter parameter) {
    this.parameter = parameter;
  }
  public LineTypeId getIdLineType() {
    return id.getLineTypeId();
  }
  public LineType getLineType() {
    return lineType;
  }  public void setLineType(LineType lineType) {
    this.lineType = lineType;
  }


}