<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
		xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
		xmlns="http://w3.org/2000/svg"
		version="1.0">

	<xsl:template match="/tabelle">
		<html>
			<body>
			<table border="1">
				<tr>
				<th>Bezeichnung </th>
				<th>Kurzbezeichnung </th>
				<th>Laengengrad </th>
				<th>Breitengrad </th>
				</tr>
				<xsl:for-each select="stop">
				<tr>
					<td><xsl:value-of select="bezeichnung" /></td>
					<td><xsl:value-of select="kurzbezeichnung" /></td>
					<td><xsl:value-of select="laengengrad" /></td>
					<td><xsl:value-of select="breitengrad" /></td>	
				</tr>
					<br/>
				</xsl:for-each>	
			</table>			
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
