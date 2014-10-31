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

package org.saiku;

import org.jbehave.core.io.StoryLoader;
import org.swift.common.soap.jira.JiraSoapServiceService;
import org.swift.common.soap.jira.JiraSoapServiceServiceLocator;
import org.swift.common.soap.jira.RemoteIssue;


public class JiraStoryLoader implements StoryLoader {

 protected String jiraId = "";

 public JiraStoryLoader(String id) {
  jiraId = id;
 }

 public String loadStoryAsText(String issueId) {
  try {

    JiraSoapServiceService jiraProxy = new JiraSoapServiceServiceLocator();

   String loginToken = jiraProxy.getJirasoapserviceV2().login("bugg_tb", "1111111111");
   RemoteIssue issue = jiraProxy.getJirasoapserviceV2().getIssue(loginToken, jiraId);
   return issue.getDescription();
  } catch (Throwable e) {
   ;
  }
  return null;
 }
}