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
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>

<xsl:template match="/*">
  <xsl:for-each-group select="//comment()" group-by=".">  	   
       <xsl:sequence select="."/>
  </xsl:for-each-group>
  <xsl:copy>  	
  	<!--
  	<xsl:copy-of select="//comment()"/>
  	-->  	
  	<xsl:apply-templates select="*"/>
  </xsl:copy>
</xsl:template>

<xsl:template match="@*|node()">
    <xsl:copy>
        <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
</xsl:template>

<xsl:template match="comment()" priority="1"/>

</xsl:stylesheet>
