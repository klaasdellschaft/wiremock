/*
 * Copyright (C) 2022 Thomas Akehurst
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
package com.github.tomakehurst.wiremock.store;

import com.github.tomakehurst.wiremock.common.FileSource;

public class DefaultStores implements Stores {

  @Override
  public StubMappingStore getStubStore() {
    return new InMemoryStubMappingStore();
  }

  @Override
  public RequestJournalStore getRequestJournalStore() {
    return null;
  }

  @Override
  public SettingsStore getSettingsStore() {
    return null;
  }

  @Override
  public ScenariosStore getScenariosStore() {
    return null;
  }

  @Override
  public FileSource getFileSource() {
    return null;
  }

  @Override
  public BlobStore getBlobStore(String name) {
    return null;
  }
}
