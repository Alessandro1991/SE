<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
		xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
		xmlns="http://w3.org/2000/svg"
		version="1.0">

	<xsl:template match="/tabelle">
		<html>
			<title>Haltestellen:</title>
			<body>
				<xsl:for-each select="stop">
					<xsl:value-of select="bezeichnung" /><br/>
					<xsl:value-of select="kurzbezeichnung" /><br/>
					<xsl:value-of select="laengengrad" /><br/>
					<xsl:value-of select="breitengrad" /><br/>	
					<br/>
				</xsl:for-each>				
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
