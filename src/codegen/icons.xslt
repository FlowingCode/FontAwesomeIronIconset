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
