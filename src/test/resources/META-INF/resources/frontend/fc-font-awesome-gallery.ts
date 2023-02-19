import { html, css, LitElement } from 'lit';
import { property } from 'lit/decorators.js';

import '@vaadin/button';
import '@vaadin/text-field';
import { Iconset } from '@vaadin/icon/vaadin-iconset.js'

class FontAwesomeGalleryDemo extends LitElement {

  @property()
  family:  string = '';
  
  @property()
  caption: string = '';
  
  @property()
  filterString: string = '';

  @property()
  _icons: string[] = [];

  static styles = css`
    :host([empty]) {
	  display: none;
    }
    
    h4 {
	    margin-top: 2ex;
	    margin-bottom: 1ex;
	}
	
    .flex {
      display: flex;
      flex-wrap: wrap;
    }
    
    .icon {
      border-radius: 4px      
     }
     
    .icon:hover {
      cursor : pointer;
      background: #f6f6f6;
     }
    
    .icon:active {
      background: #f0f0f0;
     }
 
     .icon vaadin-icon {
	    margin: 8px;
	    padding-bottom: 4px;
     }     
  `;
  
  render() {
    return html`
      <h4>${this.caption}</h4>
      <div class="flex">
       ${this._icons && this._icons.map(this.createButton.bind(this))}
      </div>
    `;
  }
  
  updated(changedProps : any) {
    if (changedProps.has('family')) {
        const iconset = Iconset.getIconset(this.family);
        let icons = [] as string[];
        if (iconset) {
            icons = Object.keys(iconset._icons).sort();
        }
        this._icons = icons;
    }
    
    let hasVisibleIcons = !!this.shadowRoot!.querySelector(".icon:not([hidden])");
    this.toggleAttribute('empty', !hasVisibleIcons);
    
    let globalHasVisibleIcons = !!document.querySelector("fc-font-awesome-gallery-demo:not([empty])");
    document.querySelector('.no-results')?.toggleAttribute('hidden', globalHasVisibleIcons);
  }
  
  createButton(icon: String) {
	return html`<div class="icon" style="width:240px" ?hidden="${!this.__testFilterString(icon)}" 
	  @click=${()=>this.__handleClick(this.family+":"+icon)}>
      <vaadin-icon icon="${this.family}:${icon}" slot="prefix"></vaadin-icon>${icon}
    </div>`;
  }
  
  __testFilterString(icon: String) {
	const matches = (s:string) => s.includes('-') ? icon.includes(s) : icon.split('-').some(word=>word.startsWith(s));
	return !this.filterString || this.filterString.split(' ').filter(s=>s).every(s => s[0]=='!' ? (s=s.substring(1), !(s &&matches(s))): matches(s));
  }
  
  __handleClick(detail: String) {
	this.dispatchEvent(new CustomEvent('iconClick', {detail}));
  }
  
}

customElements.define('fc-font-awesome-gallery-demo', FontAwesomeGalleryDemo);