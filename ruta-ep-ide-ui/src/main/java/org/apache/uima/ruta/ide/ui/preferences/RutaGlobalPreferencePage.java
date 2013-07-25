/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.uima.ruta.ide.ui.preferences;

import org.apache.uima.ruta.ide.RutaIdeUIPlugin;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;

public class RutaGlobalPreferencePage extends AbstractConfigurationBlockPreferencePage {

  @Override
  protected IPreferenceConfigurationBlock createConfigurationBlock(
          OverlayPreferenceStore overlayPreferenceStore) {
    return new RutaGlobalConfigurationBlock(overlayPreferenceStore, this);
  }

  @Override
  protected String getHelpId() {
    return null;
  }

  @Override
  protected void setDescription() {
    String description = RutaPreferencesMessages.RutaGlobalPreferencePage_description;
    setDescription(description);
  }

  @Override
  protected void setPreferenceStore() {
    setPreferenceStore(RutaIdeUIPlugin.getDefault().getPreferenceStore());
  }

}