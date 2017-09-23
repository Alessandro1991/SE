<?xml version="1.0"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
		xmlns="http://w3.org/2000/svg"
		version="1.0">


	<xsl:template match="/xmlproj">
		<svg width="600" height="600" version="1.1">
			<xsl:apply-templates />
		</svg>
	</xsl:template>

	<xsl:template match="stop">
		<xsl:attribute name="value1">
		<xsl:value-of select="laengengrad"/>
		<xsl:value-of select="breitengrad"/>
		<xsl:value-of select="bezeichnung"/>
		<xsl:value-of select="kurzbezeichnung"/>
		</xsl:attribute>
	</xsl:template>
</xsl:stylesheet>
