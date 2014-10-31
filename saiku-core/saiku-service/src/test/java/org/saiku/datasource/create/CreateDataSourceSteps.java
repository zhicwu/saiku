/*
 * Copyright 2014 OSBI Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.saiku.datasource.create;


import org.saiku.datasource.DataSteps;
import org.saiku.olap.dto.SaikuConnection;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;

import java.util.List;

/**
 * Story for lookup_datasources.story
 */
public class CreateDataSourceSteps {


  @Steps
  DataSteps data;
  private List<SaikuConnection> connections;
  private SaikuConnection ds;

  @Given("there is a H2 Foodmart instance available")
  public void givenThereIsAFoodmartInstanceAvailable() {
//Dont do anything.
  }

}
