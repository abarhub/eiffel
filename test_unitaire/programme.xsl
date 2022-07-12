<?xml version="1.0"?>
<xsl:stylesheet
	version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns="http://www.w3.org/TR/REC-html40">

	<xsl:output method="html" indent="yes"/>

	<xsl:template match="/programme">
		<html>
		<link rel="stylesheet" href="..\..\..\test_unitaire\programme.css" />
		<body>
		<SPAN CLASS="toto">Programme :</SPAN> <br/>
		var_global:<br/>
		<xsl:apply-templates select="./*" />
		</body>
		</html>
	</xsl:template>

	<xsl:template match="declare_var">
		<xsl:value-of select="@nom" /> : <xsl:apply-templates select="type" />
		<xsl:if test="./expression_scalaire">
			:=<xsl:apply-templates select="./expression_scalaire" />
		</xsl:if>
		<br />
	</xsl:template>

	<xsl:template match="classe">
		<span class="classe">classe</span> <xsl:apply-templates select="type" /><br/>
		<xsl:apply-templates select="./hierarchie" />
		<xsl:apply-templates select="./attribut" />
	</xsl:template>

	<xsl:template match="type">
		<xsl:variable name="type_like" select="contains(@est_like,'oui')" />
		<!--<xsl:variable name="type_like">true</xsl:variable>-->
		<!-- <xsl:variable name="" select=""  type-information=""></xsl:variable> -->
		<!--attribut {<xsl:value-of select="$type_like"/>} hierarchie-->
		<span class="type">
		<xsl:if test="$type_like">
			<span class="mot_clef">like</span> <xsl:value-of select="@nom" />
		</xsl:if>
		<xsl:if test="not($type_like)">
			<xsl:if test="contains(@expanded,'oui')">
				<span class="mot_clef">expanded</span>
			</xsl:if>
			<xsl:value-of select="@nom" />
			<xsl:if test="count(./*)>0">
			[
			<xsl:apply-templates select="./*" />
			]
			</xsl:if>
		</xsl:if>
		</span>
		<!-- bbb -->
	</xsl:template>

	<xsl:template match="hierarchie">
		ancetre:(<xsl:apply-templates select="./*" />)<br/>
	</xsl:template>

	<xsl:template match="attribut">
		<xsl:apply-templates select="./nom_attribut" />
		[<xsl:apply-templates select="./type[1]" />]
		<br/>
		<xsl:choose>
			<xsl:when test="./routine">
				<xsl:apply-templates select="./routine"/>
			</xsl:when>
			<xsl:otherwise>
				:<xsl:apply-templates select="./type[2]" />
			</xsl:otherwise>
		</xsl:choose>
		<xsl:if test="./expression">
			<xsl:apply-templates select="./expression"/>
		</xsl:if>
		<xsl:apply-templates select="./ascendant"/>
		<xsl:apply-templates select="./descendant"/>
		<br/>
	</xsl:template>

	<xsl:template match="nom_attribut">
		<xsl:choose>
			<xsl:when test="contains(@type,'prefix')">
				<span class="mot_clef">prefix</span> "<xsl:value-of select="@nom"/>"
			</xsl:when>
			<xsl:when test="contains(@type,'infix')">
				<span class="mot_clef">infix</span> "<xsl:value-of select="@nom"/>"
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="@nom"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="expression_scalaire">
		<xsl:choose>
			<xsl:when test="contains(@type,'void')">
				<span class="mot_clef">Void</span>
			</xsl:when>
			<xsl:when test="contains(@type,'var')">
				<xsl:apply-templates select="./var"/>
			</xsl:when>
			<xsl:when test="contains(@type,'chaine')">
				<span class="chaine">"<xsl:value-of select="@text"/>"</span>
			</xsl:when>
			<xsl:when test="contains(@type,'car')">
				<span class="car">'<xsl:value-of select="@text"/>'</span>
			</xsl:when>
			<xsl:when test="contains(@type,'booleen')">
				<span class="mot_clef"><xsl:value-of select="@text"/></span>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="@text"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="var">
		<xsl:value-of select="@nom"/>
		<xsl:if test="./expression_scalaire">
			[<xsl:apply-templates select="./expression_scalaire" />]
		</xsl:if>
	</xsl:template>

	<xsl:template match="expression">
		<xsl:apply-templates select="./node()" />
	</xsl:template>

	<xsl:template match="expression_bin">
		(<xsl:apply-templates select="./expression_scalaire[1]" />
		<xsl:choose>
			<xsl:when test="string(@type)='plus'">+</xsl:when>
			<xsl:when test="string(@type)='moins'">-</xsl:when>
			<xsl:when test="string(@type)='fois'">*</xsl:when>
			<xsl:when test="string(@type)='div_entier'">//</xsl:when>
			<xsl:when test="string(@type)='div_reel'">/</xsl:when>
			<xsl:when test="string(@type)='mod'">\\</xsl:when>
			<xsl:when test="string(@type)='and'">and</xsl:when>
			<xsl:when test="string(@type)='or'">or</xsl:when>
			<xsl:when test="string(@type)='puiss'">^</xsl:when>
			<xsl:when test="string(@type)='sups'">&gt;</xsl:when>
			<xsl:when test="string(@type)='sup'">&gt;=</xsl:when>
			<xsl:when test="string(@type)='inf'">&lt;=</xsl:when>
			<xsl:when test="string(@type)='infs'">&lt;</xsl:when>
			<xsl:when test="string(@type)='egal'">=</xsl:when>
			<xsl:when test="string(@type)='diff'">!=</xsl:when>
			<xsl:when test="string(@type)='and_then'">and then</xsl:when>
			<xsl:when test="string(@type)='or_else'">or else</xsl:when>
			<xsl:when test="string(@type)='xor'">xor</xsl:when>
			<xsl:when test="string(@type)='implies'">implies</xsl:when>
		</xsl:choose>
		<xsl:apply-templates select="./expression_scalaire[2]" />)
	</xsl:template>

	<xsl:template match="expression_un">
		<xsl:choose>
			<xsl:when test="@type='plus'">+</xsl:when>
			<xsl:when test="@type='moins'">-</xsl:when>
			<xsl:when test="@type='not'"><span class="mot_clef">not</span></xsl:when>
			<xsl:when test="@type='old'"><span class="mot_clef">old</span></xsl:when>
			<xsl:when test="@type='conv_e2d'"><span class="mot_clef">conv_e2d</span></xsl:when>
			<xsl:when test="@type='conv_e2r'"><span class="mot_clef">conv_e2r</span></xsl:when>
			<xsl:when test="@type='conv_r2d'"><span class="mot_clef">conv_r2d</span></xsl:when>
			<xsl:when test="@type='conv_d2e'"><span class="mot_clef">conv_d2e</span></xsl:when>
			<xsl:when test="@type='conv_d2r'"><span class="mot_clef">conv_d2r</span></xsl:when>
		</xsl:choose>
		<xsl:apply-templates select="./expression_scalaire[1]" />
	</xsl:template>
	
	<xsl:template match="expression_type">
		(<xsl:apply-templates select="./expression_scalaire" />
		<span class="mot_clef">as</span>
		<xsl:apply-templates select="./type" />)
	</xsl:template>
	
	<xsl:template match="expression_creation">
		<span class="mot_clef">new</span>
		<xsl:apply-templates select="./type" />
		<xsl:apply-templates select="./expression_scalaire" />
	</xsl:template>
	
	<xsl:template match="expr_appel">
		<!--<xsl:apply-templates select="./expression_scalaire[1]" />
		<xsl:apply-templates select="./nom_attribut" />
		<xsl:apply-templates select="./expression_scalaire[position()>1]" />-->
		<xsl:if test="./expression_scalaire[1]">
			<xsl:apply-templates select="./expression_scalaire[1]" />.
		</xsl:if>
		<xsl:apply-templates select="./nom_attribut" />
		<xsl:if test="./expression_scalaire[position()>1]">
			(<xsl:apply-templates select="./expression_scalaire[position()>1]" />)
		</xsl:if>
	</xsl:template>
	
	<xsl:template match="ascendant">
		(asc:<xsl:value-of select="@no"/>
		<xsl:if test="./nom_attribut">
			,<xsl:apply-templates select="./nom_attribut" />
		</xsl:if>
		)
	</xsl:template>
	
	<xsl:template match="descendant">
		(desc:<xsl:apply-templates select="./nom_attribut" />
		,<xsl:apply-templates select="./type" />)
	</xsl:template>
	
	<xsl:template match="signature">
		<xsl:apply-templates select="./declare_var" />
	</xsl:template>
	
	<xsl:template match="routine">
		<xsl:apply-templates select="./signature" />
		<xsl:apply-templates select="./precondition" />
		<xsl:apply-templates select="./declare_var" />
		<xsl:apply-templates select="./instruction" />
		<xsl:apply-templates select="./postcondition" />
	</xsl:template>
	
	<xsl:template match="precondition">
		<xsl:apply-templates select="./declare_var" />
		<xsl:apply-templates select="./instruction" />
	</xsl:template>
	
	<xsl:template match="postcondition">
		<xsl:apply-templates select="./declare_var" />
		<xsl:apply-templates select="./instruction" />
	</xsl:template>
	
	<xsl:template match="instruction">
		<span class="mot_clef">do</span><BR/> 
		<xsl:apply-templates select="./node()" /> 
		<span class="mot_clef">end</span>
	</xsl:template>
	
	<xsl:template match="instr_affect">
		<xsl:apply-templates select="./expression_scalaire" />
		:= <xsl:apply-templates select="./expression" /><br/>
	</xsl:template>
	
	<xsl:template match="instr_appel">
		<xsl:if test="./expression_scalaire[1]">
			<xsl:apply-templates select="./expression_scalaire[1]" />.
		</xsl:if>
		<xsl:apply-templates select="./nom_attribut" />
		<xsl:if test="./expression_scalaire[position()>1]">
			(<xsl:apply-templates select="./expression_scalaire[position()>1]" />)
		</xsl:if>
		<br/>
	</xsl:template>
	
	<xsl:template match="instr_si">
		<span class="mot_clef">if</span> <xsl:apply-templates select="./expression" />
		<span class="mot_clef">then</span> <xsl:apply-templates select="./@label" /><br/>
	</xsl:template>
	
	<xsl:template match="instr_goto">
		<span class="mot_clef">goto</span> <xsl:apply-templates select="./@label" /><br/>
	</xsl:template>
	
	<xsl:template match="instr_label">
		<span class="mot_clef">label</span> 
		<xsl:apply-templates select="./@label" />:<br/>
	</xsl:template>
	
	<xsl:template match="instr_return">
		<span class="mot_clef">return</span><br/>
	</xsl:template>
	
	<xsl:template match="instr_raise">
		<span class="mot_clef">raise</span> 
		<xsl:apply-templates select="./expression[1]" />,
		<xsl:apply-templates select="./expression[2]" /><br/>
	</xsl:template>
	
</xsl:stylesheet>
