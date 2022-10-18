import { html, css, LitElement } from 'lit';
import { property } from 'lit/decorators.js';

import '@vaadin/button';
import '@vaadin/text-field';

class FontAwesomeGalleryDemo extends LitElement {

  @property()
  family:  string;
  
  @property()
  caption: string;
  
  @property()
  filterString: string;

  @property()
  _icons: string[];

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
        const iconset = document.querySelector("fc-iconset[name='"+this.family+"']") as any;
        let icons = [];
        if (iconset) {
            (iconset as any).applyIcon(null);
            icons = Object.keys(iconset._icons).concat(Object.keys(iconset._alias)).sort();
        }
        this._icons = icons;
    }
    
    let hasVisibleIcons = !!this!.shadowRoot.querySelector(".icon:not([hidden])");
    this.toggleAttribute('empty', !hasVisibleIcons);
    
    let globalHasVisibleIcons = !!document.querySelector("fc-font-awesome-gallery-demo:not([empty])");
    document.querySelector('.no-results').toggleAttribute('hidden', globalHasVisibleIcons);
  }
  
  createButton(icon: String) {
	return html`<div class="icon" style="width:240px" ?hidden="${!this.__testFilterString(icon)}" 
	  @click=${()=>this.__handleClick(this.family+":"+icon)}>
      <vaadin-icon icon="${this.family}:${icon}" slot="prefix"></vaadin-icon>${icon}
    </div>`;
  }
  
  __testFilterString(icon: String) {
	if (!this.filterString) return true;
	if (this.filterString.includes('-')) return icon.includes(this.filterString);
	return  icon.split('-').some(word=>word.startsWith(this.filterString));
  }
  
  __handleClick(detail: String) {
	this.dispatchEvent(new CustomEvent('iconClick', {detail}));
  }
  
}

customElements.define('fc-font-awesome-gallery-demo', FontAwesomeGalleryDemo);