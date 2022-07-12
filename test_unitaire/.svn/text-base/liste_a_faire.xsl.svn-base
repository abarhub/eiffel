<?xml version="1.0"?>
<xsl:stylesheet
	version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns="http://www.w3.org/TR/REC-html40">

	<xsl:output method="html" indent="yes"/>
	
	<xsl:template match="/liste_afaire">
		<html>
		<link rel="stylesheet" href="liste_a_faire.css" />
		<table border="1">
			<tr><td colspan="2"><h1>Liste des taches</h1></td></tr>
			<xsl:apply-templates select="child::herarchie" />
		</table>
		</html>
	</xsl:template>

	<!-- retourne le nombre de feuilles totales -->
	<xsl:template name="total">
		<xsl:param name="chemin" />
		<xsl:for-each select="child::*">
			<xsl:choose>
				<xsl:when test="self::afaire">
					<xsl:value-of select="1"/>
				</xsl:when>
				<xsl:when test="self::herarchie">
					<xsl:call-template name="total">
						<xsl:with-param name="chemin" select="self::herarchie"/>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<div>Erreur</div>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>

	<!-- retourne le nombre de feuilles avec fait a oui -->
	<xsl:template name="reussite">
		<xsl:param name="chemin" />
		<xsl:for-each select="child::*">
			<xsl:choose>
				<xsl:when test="self::afaire">
					<xsl:if test="@fait='oui'">
						<xsl:value-of select="1"/>
					</xsl:if>
				</xsl:when>
				<xsl:when test="self::herarchie">
					<xsl:call-template name="reussite">
						<xsl:with-param name="chemin" select="self::herarchie"/>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<div>Erreur</div>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>

	<!-- affiche le taux de reussite -->
	<xsl:template name="taux_reussite2">
		<xsl:param name="chemin" />
		<xsl:variable name="str">
			<xsl:call-template name="total">
				<xsl:with-param name="chemin" select="$chemin"/>
			</xsl:call-template>
		</xsl:variable>
		<xsl:variable name="str2">
			<xsl:call-template name="reussite">
				<xsl:with-param name="chemin" select="$chemin"/>
			</xsl:call-template>
		</xsl:variable>
		<xsl:variable name="reussite" select="string-length($str2)"/>
		<xsl:variable name="total" select="string-length($str)"/>
		<xsl:value-of select="$reussite"/>/
		<xsl:value-of select="$total"/>=
		<xsl:value-of select="format-number(($reussite div $total)*100,'##0.0')"/>%
	</xsl:template>

	<!-- affiche une hierarchie de taches -->
	<xsl:template match="herarchie">
		<tr>
			<td>
				<xsl:value-of select="@nom"/>
				[<xsl:call-template name="taux_reussite2">
					<xsl:with-param name="chemin" select="."/>
				</xsl:call-template>]
			</td>
			<td>
				<ul>
				<xsl:for-each select="child::node()">
				<xsl:choose>
					<xsl:when test="self::herarchie">
						<table border="1" width="100%">
							<xsl:apply-templates select="self::herarchie" />
						</table>
					</xsl:when>
					<xsl:when test="self::afaire">
						<xsl:apply-templates select="self::afaire" />
					</xsl:when>
					<xsl:otherwise>
						
							<!--<xsl:apply-templates select="self::afaire" />
						<xsl:value-of select="."/>
						<xsl:apply-templates select="." />-->
						<!--<table border="1" width="100%">
							<xsl:apply-templates select="*" />
						</table>-->
						Erreur (0000)
					</xsl:otherwise>
				</xsl:choose>
				</xsl:for-each>
				
				</ul>
			</td>
		</tr>
	</xsl:template>

	<!-- affiche une tache de la bonne couleur -->
	<xsl:template match="afaire">
		<li/>
		<xsl:choose>
			<xsl:when test="attribute::fait='oui'">
				<div class="a_faire">
					<xsl:value-of select="text()"/>
					(<xsl:value-of select="@debut" />
					<![CDATA[->]]>
					<xsl:value-of select="@fin" />)
				</div>
			</xsl:when>
			<xsl:when test="not(@fait) or @fait='non'">
				<div class="fait">
					<xsl:value-of select="text()"/>
				</div>
			</xsl:when>
			<xsl:otherwise>
				Erreur:
				<div style="color:green">
					<xsl:value-of select="text()"/>
					(<xsl:value-of select="@fait"/>)
				</div>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

</xsl:stylesheet>
