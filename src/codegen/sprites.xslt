<!--
  #%L
  FontAwesome Iron Iconset
  %%
  Copyright (C) 2019 - 2023 Flowing Code
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
<xsl:stylesheet version="1.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:fn="http://www.w3.org/2005/xpath-functions"
	xmlns:svg="http://www.w3.org/2000/svg">
  
  <xsl:output method="xml" indent="yes" encoding="UTF-8" cdata-section-elements="object"/>
  
  <xsl:param name = "family"/>
  <xsl:param name = "familyLong"/>
  <xsl:param name = "license"/>
  
  <xsl:template match="/svg:svg">
  	<xsl:comment>
  		<xsl:value-of select="$license"/>
  	</xsl:comment>
  	<xsl:element name="fc-iconset">
  		<xsl:attribute name="name">
  			<xsl:value-of select="$family"/>
  		</xsl:attribute>
  		
  		<xsl:call-template name="aliases"/>
  		
	  	<svg><defs>
	
		<xsl:apply-templates select="svg:symbol"/>		
		</defs></svg>
	</xsl:element>	
  </xsl:template>
  
  <xsl:template match="/svg:svg/svg:symbol">
  	<xsl:element name="g">
  		<xsl:apply-templates select="@id"/>
  		<xsl:element name="svg">
  			<xsl:copy-of select="@viewBox"/>
	  		<xsl:apply-templates/>
  		</xsl:element>
  	</xsl:element>
  </xsl:template>
  
  <xsl:template match="//svg:symbol[@id='vaadin']/@id">
  	<xsl:attribute name="id">
  	  <xsl:text>vaadin-icon</xsl:text>
  	</xsl:attribute>
  </xsl:template>
  
  <xsl:template match="@*|node()">
    <xsl:copy>
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>
  
  <xsl:template name="aliases">
  	<xsl:element name="object">
  		<xsl:attribute name="type">application/json</xsl:attribute> 
  		<xsl:attribute name="slot">alias</xsl:attribute>    
		<xsl:variable name="document" select="document('aliases.xml')"/>
		<xsl:variable name="aliases"  select="$document//style[@name=$familyLong]/fn:map"/> 
		<xsl:copy-of select="fn:xml-to-json($aliases, map { 'indent' : true() })"/><xsl:text
       >&#13;&#10;   </xsl:text>
    </xsl:element>
  </xsl:template>
</xsl:stylesheet>
