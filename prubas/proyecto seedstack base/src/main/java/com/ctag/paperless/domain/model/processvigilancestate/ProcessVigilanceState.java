package com.ctag.paperless.domain.model.processvigilancestate;

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
@Table(name = ProcessVigilanceState.TABLE_NAME)
@IdClass(ProcessVigilanceStateId.class)
public class ProcessVigilanceState extends BaseAggregateRoot<ProcessVigilanceStateId> {
   
public static final String TABLE_NAME = "ProcessVigilanceState";
private static final String ID = "id"; 
private static final String KEY_VAL = "KeyVal";
private static final String SEQUENCE = "SEQUENCE";
private static final String VALUE = "Value";
private static final String ID_PROCESSVIGILANCESTATE = " idProcessVigilanceState ";
private static final String FIELD_NAME = "Name";   
private static final String GENERATOR = "ProcessVigilanceStateGen";

  @TableGenerator(name = GENERATOR, table = SEQUENCE, pkColumnName = KEY_VAL, valueColumnName = VALUE, pkColumnValue = TABLE_NAME, allocationSize = 1)
  @Id
  @GeneratedValue(strategy = GenerationType.TABLE, generator = GENERATOR)
  @Column(name = ID_PROCESSVIGILANCESTATE, nullable = false, unique = true)
  private Integer id;

  @Column(name = FIELD_NAME,unique = false,  nullable = false)
  private String name;

  ProcessVigilanceState() {
    // Required by Hibernate
  }



  @Override
  public ProcessVigilanceStateId getId() {
    return new ProcessVigilanceStateId(id);
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


}