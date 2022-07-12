<?xml version="1.0" encoding="ISO-8859-1" ?>
<xsl:stylesheet
	version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns="http://www.w3.org/TR/REC-html40">

<xsl:output method="html" 
			encoding="ISO-8859-1" 
			doctype-public="-//W3C//DTD HTML 4.0 Transitional//EN"
			indent="yes"/>

	<xsl:template match="/liste_validite">
		<html>
		<head>
		<link rel="stylesheet" href="valide.css" />
		<!-- <?xml-stylesheet type="text/css" href="valide.css"?> -->
		<xsl:comment>
			Document généré par validite.xsl
		</xsl:comment>
		<title>Liste des règles</title>
		</head>
		<body>
		<h1>Liste des règles</h1>
		<xsl:for-each select="child::regle">
			<xsl:apply-templates select="."/>
		</xsl:for-each>
		<hr/>
		</body>
		</html>
	</xsl:template>

	<xsl:template match="regle">
		<hr/>
		Regle <b><xsl:value-of select="@nom"/></b>
				(page <xsl:value-of select="@page"/>)<br/>
		<dl>
			<dt/><u><xsl:value-of select="titre"/>:</u>
			<dl/><xsl:apply-templates select="corps"/>
		</dl>
	</xsl:template>

	<xsl:template match="corps">
		nombre de noeuds:<xsl:value-of select="count(self::*|child::*)"/><br/>
		<xsl:for-each select="self::*|child::*">
			* debut
			<xsl:choose>
				<xsl:when test="self::liste">
					liste
					<ol>
						<xsl:for-each select="child::*">
							<xsl:choose>
								<xsl:when test="self::enum">
									<li/>{
									<xsl:value-of select="text()"/>}
								</xsl:when>
								<xsl:otherwise>
									[<xsl:value-of select="text()"/>]
								</xsl:otherwise>
							</xsl:choose>
						</xsl:for-each>
					</ol>
				</xsl:when><xsl:when test="child::enum">
					enum
				</xsl:when>
				<xsl:when test="self::text()">
					coucou1(<xsl:value-of select="child::text()"/>)
				</xsl:when>
				<xsl:when test="self::text()[position()=1]">
					coucou2(<xsl:value-of select="child::text()"/>)
				</xsl:when>
				<xsl:when test="self::*=.">
					coucou3(<xsl:value-of select="child::text()"/>)
				</xsl:when>
				<xsl:otherwise>
					autre(<xsl:value-of select="."/>)
					<!--<xsl:value-of select="."/>-->
				</xsl:otherwise>
			</xsl:choose>
			fin<br/>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>
