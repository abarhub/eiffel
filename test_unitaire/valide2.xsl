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
		<hr/>
		<xsl:for-each select="child::regle">
			<xsl:sort select="@nom"/>
			<xsl:element name="a">
				<xsl:attribute name="href">#<xsl:value-of select="@nom"/></xsl:attribute>
				<xsl:value-of select="@nom"/>
			</xsl:element>
		</xsl:for-each>
		(<xsl:variable name="nbregle" select="count(child::regle)"/>
		<xsl:value-of select="$nbregle"/>/74=
		<xsl:value-of select="format-number(($nbregle div 74)*100,'##0.0')"/>%)
		<xsl:for-each select="child::regle">
			<xsl:sort select="@page" data-type="number"/>
			<xsl:apply-templates select="."/>
		</xsl:for-each>
		<hr/>
		</body>
		</html>
	</xsl:template>

	<xsl:template match="regle">
		<hr/>
		<xsl:element name="a">
			<xsl:attribute name="name">
				<xsl:value-of select="@nom"/>
			</xsl:attribute>
			Regle <b><xsl:value-of select="@nom"/></b>
				(chapitre <xsl:value-of select="@chapitre"/>,
				page <xsl:value-of select="@page"/>)
		</xsl:element>
		<br/>
		<dl>
			<dt/>
				<xsl:if test="string-length(titre/child::text())>=1">
					<u><xsl:value-of select="titre"/>:</u>
				</xsl:if>
				<xsl:if test="not(string-length(titre/child::text())>=1)">
					
				</xsl:if>
			<dd/><xsl:apply-templates select="corps"/>
		</dl>
	</xsl:template>

	<xsl:template match="corps">
		<!--nombre de noeuds:<xsl:value-of select="count(self::*|child::*|child::text())"/><br/>-->
		<xsl:for-each select="child::*|child::text()">
			<xsl:choose>
				<xsl:when test="self::liste">
					<xsl:apply-templates select="."/>
				</xsl:when>
				<xsl:when test="self::ref">
					coucou
					<xsl:apply-templates select="."/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:apply-templates select="."/>
				</xsl:otherwise>
			</xsl:choose><br/>
		</xsl:for-each>
	</xsl:template>

	<xsl:template match="liste">
		<ol>
			<xsl:for-each select="child::*">
				<xsl:choose>
					<xsl:when test="self::enum">
						<li/>
						<xsl:apply-templates select="."/>
					</xsl:when>
					<xsl:otherwise>
						[<xsl:value-of select="."/>]
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
		</ol>
	</xsl:template>
	
	<xsl:template match="ref">
		<xsl:variable name="lien" select="@href"/>
		<xsl:variable name="type" select="@type"/>
		<xsl:element name="a">
			<xsl:attribute name="href">
				<xsl:value-of select="$lien"/>
			</xsl:attribute>
			<xsl:value-of select="child::text()"/>
			(<xsl:value-of select="$lien"/>,<xsl:value-of select="$type"/>)
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="enum">
		<!--nombre de noeuds:<xsl:value-of select="count(self::*|child::*|child::text())"/><br/>-->
		<xsl:for-each select="child::*|child::text()">
			<xsl:choose>
				<xsl:when test="self::liste">
					<xsl:apply-templates select="."/>
				</xsl:when>
				<xsl:when test="self::ref">
					<xsl:apply-templates select="."/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:apply-templates select="."/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>

</xsl:stylesheet>
