package com.ctag.paperless.domain.model.processvigilancestate;

import org.seedstack.business.domain.Factory;

public interface ProcessVigilanceStateFactory extends Factory<ProcessVigilanceState> {
  
 ProcessVigilanceState createProcessVigilanceState(String name);


}
