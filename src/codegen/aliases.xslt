<!--
  #%L
  FontAwesome Iconset
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
<xsl:stylesheet version="3.0" 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  
  xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:output method="xml" indent="yes"/>
    
	<xsl:template match="/root">
		<xsl:variable name="metadata">
			<xsl:copy-of select="fn:json-to-xml(/*)"/>
	    </xsl:variable>	    	
 	    <xsl:variable name="filtered">
	    	<xsl:apply-templates select="$metadata"/>
		</xsl:variable>
		
		<xsl:variable name="result"> 
			<xsl:for-each select="fn:distinct-values($filtered//fn:array[@key='styles']/*)">
				<xsl:variable name="family">
					<xsl:value-of select="."/>
				</xsl:variable>
				<xsl:element name="style">
					<xsl:attribute name="name">
						<xsl:value-of select="$family"/>
					</xsl:attribute>
					<xsl:element name="map" namespace="http://www.w3.org/2005/xpath-functions">
						<xsl:for-each select="$filtered/fn:map/fn:map[fn:array[@key='styles']/fn:string/text()=$family]">
							<xsl:variable name="key">
								<xsl:value-of select="@key"/>
							</xsl:variable>
							<xsl:for-each select="fn:map[@key='aliases']/fn:array[@key='names']/fn:string">
								<xsl:element name="string" namespace="http://www.w3.org/2005/xpath-functions">
									<xsl:attribute name="key">
										<xsl:value-of select="text()"/>
									</xsl:attribute>
									<xsl:value-of select="$key"/>
								</xsl:element>					
							</xsl:for-each>
						</xsl:for-each>
						<xsl:if test="$family='brands'">
							<xsl:call-template name="vaadin-icon"/>
						</xsl:if>
					</xsl:element>
				</xsl:element>
			</xsl:for-each>
		</xsl:variable>
		
		<xsl:element name="styles">	
			<xsl:apply-templates select="$result"/>
		</xsl:element>
	</xsl:template>
	 
	<xsl:template name="vaadin-icon">
		<xsl:element name="string" namespace="http://www.w3.org/2005/xpath-functions">
			<xsl:attribute name="key">
				<xsl:text>vaadin</xsl:text>
			</xsl:attribute>
			<xsl:text>vaadin-icon</xsl:text>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="/fn:map/fn:map" priority="0"/>
	<xsl:template match="/fn:map/fn:map[fn:map[@key='aliases']/*]">
		<xsl:copy>
			<xsl:apply-templates select="@*"/>
			<xsl:apply-templates select="fn:map[@key='aliases']"/>
			<xsl:apply-templates select="fn:array[@key='styles']"/>
		</xsl:copy>
	</xsl:template>

	<xsl:template match="/fn:map/fn:map[fn:map[@key='aliases']]/fn:map/fn:map[@key='unicodes']"/>
	
	<!-- 
	<xsl:template match="/style[not(@name='brands')]/fn:map/fn:string[@key='font-awesome-flag']"/>
	<xsl:template match="/style[not(@name='brands')]/fn:map/fn:string[@key='font-awesome-logo-full']"/>	
	-->
	 
	<xsl:template match="node()|@*">
		<xsl:copy>
			<xsl:apply-templates select="node()|@*"/>
		</xsl:copy>
	</xsl:template>
		
</xsl:stylesheet>
