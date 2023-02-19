<!--
  #%L
  FontAwesome Iron Iconset
  %%
  Copyright (C) 2019 - 2022 Flowing Code
  %%
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  
       http://www.apache.org/licenses/LICENSE-2.0
  
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
  #L%
  -->
<xsl:stylesheet version="3.0" expand-text="no" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes" omit-xml-declaration="yes"/>
<xsl:strip-space elements="*"/>

<xsl:param name = "family"/>

<xsl:template match="/*">
	<xsl:text disable-output-escaping="yes"
>
import '@vaadin/icon/vaadin-icon.js';
import { Iconset } from '@vaadin/icon/vaadin-iconset.js';
import { css, registerStyles } from '@vaadin/vaadin-themable-mixin/vaadin-themable-mixin.js';
</xsl:text>

<xsl:call-template name="registerStyles"/>

<xsl:text>
const aliases = </xsl:text>
<xsl:copy-of select="//fc-iconset/object[@slot='alias']/text()"/>
<xsl:text>;

const template = document.createElement('template');

template.innerHTML = `
</xsl:text>
    <xsl:copy-of select="//fc-iconset/svg"/>
<xsl:text>`;

Iconset.register('</xsl:text
><xsl:value-of select="$family"/><xsl:text
>', 1000, template);

const iconset = Iconset.getIconset('</xsl:text
><xsl:value-of select="$family"/><xsl:text
>');

for (const name in aliases) {
    iconset._icons[name] = iconset._icons[aliases[name]];
}

</xsl:text>
</xsl:template>

<xsl:template match="@*|node()">
    <xsl:copy>
        <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
</xsl:template>

<xsl:template match="comment()" priority="1">
	<xsl:text>&#xa;/*@license</xsl:text>
	<xsl:value-of select="replace(.,'\s*((#(%L|L%))|%%)','')"/>
	<xsl:text>*/&#xa;</xsl:text>
</xsl:template>

<xsl:template name="registerStyles">
<xsl:text>
registerStyles(
  'vaadin-button',
  css`</xsl:text
><xsl:text expand-text="yes">
    [part] ::slotted(vaadin-icon[icon^='{$family}:']), [part] ::slotted(iron-icon[icon^='{$family}:'])</xsl:text
><xsl:text> 
    {
      padding: 0.25em;
      box-sizing: border-box !important;
    }`,
  );
</xsl:text>
</xsl:template>

</xsl:stylesheet>
