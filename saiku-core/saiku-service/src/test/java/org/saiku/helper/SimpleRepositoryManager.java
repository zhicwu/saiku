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

package org.saiku.helper;

import org.saiku.database.dto.MondrianSchema;
import org.saiku.datasources.connection.RepositoryFile;
import org.saiku.repository.AclEntry;
import org.saiku.repository.DataSource;
import org.saiku.repository.IRepositoryManager;
import org.saiku.repository.IRepositoryObject;
import org.saiku.service.user.UserService;

import java.io.IOException;
import java.util.List;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;

/**
 * Created by bugg on 31/10/14.
 */
public class SimpleRepositoryManager implements IRepositoryManager{


  public void init() {

  }

  public boolean start(UserService userService) throws RepositoryException {
    return false;
  }

  public void createUser(String u) throws RepositoryException {

  }

  public NodeIterator getHomeFolders() throws RepositoryException {
    return null;
  }

  public Node getHomeFolder(String directory) throws RepositoryException {
    return null;
  }

  public Node getFolder(String user, String directory) throws RepositoryException {
    return null;
  }

  public void shutdown() {

  }

  public boolean createFolder(String username, String folder) throws RepositoryException {
    return false;
  }

  public boolean deleteFolder(String folder) throws RepositoryException {
    return false;
  }

  public void deleteRepository() throws RepositoryException {

  }

  public boolean moveFolder(String user, String folder, String source, String target) throws RepositoryException {
    return false;
  }

  public Node saveFile(Object file, String path, String user, String type, List<String> roles)
      throws RepositoryException {
    return null;
  }

  public void removeFile(String path, String user, List<String> roles) throws RepositoryException {

  }

  public void moveFile(String source, String target, String user, List<String> roles) throws RepositoryException {

  }

  public Node saveInternalFile(Object file, String path, String type) throws RepositoryException {
    return null;
  }

  public String getFile(String s, String username, List<String> roles) throws RepositoryException {
    return null;
  }

  public String getInternalFile(String s) throws RepositoryException {
    return null;
  }

  public void removeInternalFile(String s) throws RepositoryException {

  }

  public List<MondrianSchema> getAllSchema() throws RepositoryException {
    return null;
  }

  public List<DataSource> getAllDataSources() throws RepositoryException {
    return null;
  }

  public void saveDataSource(DataSource ds, String path) throws RepositoryException {

  }

  public byte[] exportRepository() throws RepositoryException, IOException {
    return new byte[0];
  }

  public void restoreRepository(byte[] xml) throws RepositoryException, IOException {

  }

  public RepositoryFile getFile(String fileUrl) {
    return null;
  }

  public List<IRepositoryObject> getAllFiles(String type, String username, List<String> roles) {
    return null;
  }

  public void deleteFile(String datasourcePath) {

  }

  public AclEntry getACL(String object, String username, List<String> roles) {
    return null;
  }

  public void setACL(String object, String acl, String username, List<String> roles) throws RepositoryException {

  }

  public List<MondrianSchema> getInternalFilesOfFileType(String type) throws RepositoryException {
    return null;
  }

  public void createFileMixin(String type) throws RepositoryException {

  }

  public Object getRepositoryObject() {
    return null;
  }
}
