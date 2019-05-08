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