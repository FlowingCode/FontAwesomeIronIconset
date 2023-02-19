/*@license
  FontAwesome Iron Iconset
  Copyright (C) 2019 - 2023 Flowing Code
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

/*!
 * Font Awesome Free 5.13.1 by @fontawesome - https://fontawesome.com
 * License - https://fontawesome.com/license/free (Icons: CC BY 4.0, Fonts: SIL OFL 1.1, Code: MIT License)
 */

import {Icon} from '@vaadin/icon/vaadin-icon.js';
import {html} from '@polymer/polymer/polymer-element.js';

class DuotoneIcon extends Icon {
	static get is() { return 'duotone-icon'; }
	
	static get template() {
		return html`
		<style>
			path.fa-primary {
				color:   var(--fa-primary-color);
				opacity: var(--fa-primary-opacity, 1);
			}
		
			path.fa-secondary {
		  		color:   var(--fa-secondary-color);
		  		opacity: var(--fa-secondary-opacity, 0.4);
			}
		</style>
		${super.template}
	`;}
  
}

customElements.define(DuotoneIcon.is, DuotoneIcon);
