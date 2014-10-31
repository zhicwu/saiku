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


import org.saiku.olap.dto.SaikuConnection;
import org.saiku.olap.util.exception.SaikuOlapException;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Story for lookup_datasources.story
 */
public class CreateDataSourceSteps {


  @Steps
  DataSteps data = new DataSteps();
  private List<SaikuConnection> connections;
  private SaikuConnection ds;

  @Given("there is a H2 Foodmart instance available")
  public void givenThereIsAFoodmartInstanceAvailable() {
    try {
      data.load();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @When("Joe passes the connection details to Saiku")
  public void whenJoePassesTheConnectionDetailsToSaiku() {
    ArrayList l = new ArrayList();
    l.add("foodmart");
    data.addDataSources(l);
    try {
      data.loadsingle();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Then("the server should connect and return metadata")
  public void thenTheServerShouldConnectAndReturnMetadata() {
    try {
      SaikuConnection retu = data.getConnection("foodmart");
      assertThat(retu, notNullValue());
    } catch (SaikuOlapException e) {
      e.printStackTrace();
    }
  }

  @Given("there is no database available")
  @Pending
  public void givenThereIsNoDatabaseAvailable() {
    // PENDING
  }

  @When("Joe passes the correct connection details")
  @Pending
  public void whenJoePassesTheCorrectConnectionDetails() {
    // PENDING
  }

  @Then("Saiku should fail with an exception")
  @Pending
  public void thenSaikuShouldFailWithAnException() {
    // PENDING
  }

  @Given("there is a database available")
  @Pending
  public void givenThereIsADatabaseAvailable() {
    // PENDING
  }

  @When("Joe passes an incorrect jdbc string")
  @Pending
  public void whenJoePassesAnIncorrectJdbcString() {
    // PENDING
  }


  @When("Joe passes the correct database connection but incorrect catalog")
  @Pending
  public void whenJoePassesTheCorrectDatabaseConnectionButIncorrectCatalog() {
    // PENDING
  }








}
