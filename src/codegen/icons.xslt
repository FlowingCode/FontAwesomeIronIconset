<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:output method="text" encoding="UTF-8"/>
  
  <xsl:template match="/">
  	<xsl:apply-templates select="//g/@id"/>
  </xsl:template>
  
  <xsl:template match="//g/@id">
	<xsl:value-of select="."/>
	<xsl:text>;</xsl:text>	    
  </xsl:template>
    
</xsl:stylesheet>