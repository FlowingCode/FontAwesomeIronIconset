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
<xsl:stylesheet version="1.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:svg="http://www.w3.org/2000/svg">
  
  <xsl:output method="xml" indent="yes" encoding="UTF-8"/>
  
  <xsl:param name = "family"/>
  <xsl:param name = "license"/>
  
  <xsl:template match="/svg:svg">
  	<xsl:comment>
  		<xsl:value-of select="$license"/>
  	</xsl:comment>
  	<xsl:element name="iron-iconset-svg">
  		<xsl:attribute name="name">
  			<xsl:value-of select="$family"/>
  		</xsl:attribute>
	  	<svg><defs>
	
		<xsl:apply-templates select="svg:symbol"/>		
		</defs></svg>
	</xsl:element>	
  </xsl:template>
  
  <xsl:template match="/svg:svg/svg:symbol">
  	<xsl:element name="g">
  		<xsl:copy-of select="@id"/>
  		<xsl:element name="svg">
  			<xsl:copy-of select="@viewBox"/>
	  		<xsl:apply-templates/>
  		</xsl:element>
  	</xsl:element>
  </xsl:template>
  
  <xsl:template match="@*|node()">
    <xsl:copy>
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>
  
</xsl:stylesheet>
