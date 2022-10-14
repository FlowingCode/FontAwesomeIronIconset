/*@license
  FontAwesome Iron Iconset
  Copyright (C) 2019 - 2022 Flowing Code
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  
       http://www.apache.org/licenses/LICENSE-2.0
  
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

import {Iconset} from '@vaadin/icon/vaadin-iconset.js';

export class FcIconset extends Iconset {
  static get template() {
    return null;
  }

  static get is() {
    return 'fc-iconset';
  }

  applyIcon(name) {
    this._alias = this._alias || this.__createAliasMap();
    name = this.__getIconId(name);
    name = this._alias[name] || name;
    return super.applyIcon(name);
  }

  /**
   * Create a map of icon aliases.
   */
  __createAliasMap() {
	var alias = this.querySelector('[slot="alias"]'); 
    return alias ? JSON.parse(alias.innerHTML.replaceAll(/\s/g,"")) : {};
  }	
  
}


customElements.define(FcIconset.is, FcIconset);