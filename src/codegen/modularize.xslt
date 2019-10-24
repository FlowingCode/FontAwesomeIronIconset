<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes" omit-xml-declaration="yes"/>
<xsl:strip-space elements="*"/>

<!-- rename root (keep namespace) -->
<xsl:template match="/*">
	<xsl:text disable-output-escaping="yes"
>
import '@polymer/iron-icon/iron-icon.js';
import '@polymer/iron-iconset-svg/iron-iconset-svg.js';
import {html} from '@polymer/polymer/lib/utils/html-tag.js';

const template = html`
</xsl:text>
    <xsl:copy-of select="."/>
    
    <xsl:text disable-output-escaping="yes"
>`;

document.head.appendChild(template.content);
</xsl:text>
</xsl:template>

<!-- identity transform -->
<xsl:template match="@*|node()">
    <xsl:copy>
        <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
</xsl:template>

<xsl:template match="comment()" priority="1">
	<xsl:text>&#xa;/*@license</xsl:text>
	<xsl:value-of select="replace(.,'\s*(#%L|#L%|%%)','')"/>
	<xsl:text>*/&#xa;</xsl:text>
</xsl:template>

</xsl:stylesheet>