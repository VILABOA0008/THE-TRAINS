package ctag.dtos.dto.line;


import org.seedstack.business.assembler.DtoOf;

@DtoOf(Line.class)
public class LineRepresentation {

  private Integer idLine;
private String name;
private Integer idLineType;


  @MatchingEntityId
  @MatchingFactoryParameter(index = 0)
  public Integer getIdLine() {
    return idLine;
  }

 @MatchingFactoryParameter(index = 1)
  public String getName() {
    return name;  }

  @MatchingFactoryParameter(index = 2)
  public Integer getIdLineType() {
    return idLineType;  }

  public void setName(String  name) {
    this.name = name;  }

  public void setIdLine(Integer idLine) {
    this.idLine = idLine;
  }  public void setIdLineType(Integer  idLineType) {
    this.idLineType = idLineType;  }


}