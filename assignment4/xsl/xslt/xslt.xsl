<?xml version="1.0" encoding="UTF-8"?>
<!--
Translator: B.Armbruster Altova GmbH
XSLT2 translation of the XQuery use case
Filename: treeQ6.xsl
Section:   1.2.4.6 Q6 
Purpose:  Make a nested list of the section elements in Book1,  preserving their original attributes and hierarchy. Inside each section element,  include the title of the section and an element that includes  the number of figures immediately contained in the section.
-->
<!--
XML Query Use Cases: http://www.w3.org/TR/xquery-use-cases/
Copyright ©2003 World Wide Web Consortium, (Massachusetts Institute of Technology, European Research Consortium for Informatics and Mathematics, Keio University). All Rights Reserved. This work is distributed under the W3C® Software License [1] in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
[1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
-->

<xsl:stylesheet version="1.0" 
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >

<xsl:template match="/">

	<xsl:element name="课程成绩列表">
		<xsl:for-each select="/学生列表/学生/个人成绩/单科成绩">
			<xsl:sort select="child::课程/课程编号"></xsl:sort>
			<xsl:sort select="child::平时成绩"></xsl:sort>
			<xsl:element name="课程成绩">
				<xsl:attribute name="课程编号">
					<xsl:value-of select="child::课程/课程编号"></xsl:value-of>
				</xsl:attribute>
				<xsl:attribute name="成绩性质">
					平时成绩
				</xsl:attribute>
				<xsl:element name="成绩">
					<xsl:element name="学号">
						<xsl:value-of select="ancestor::学生/个人基本信息/学号"></xsl:value-of>
					</xsl:element>
					<xsl:element name="得分">
						<xsl:value-of select="child::平时成绩"></xsl:value-of>
					</xsl:element>
				</xsl:element>
				
				
			</xsl:element>
			
		</xsl:for-each>
		
		<xsl:for-each select="/学生列表/学生/个人成绩/单科成绩">
			<xsl:sort select="child::课程/课程编号"></xsl:sort>
			<xsl:sort select="child::期末成绩"></xsl:sort>
			<xsl:element name="课程成绩">
				<xsl:attribute name="课程编号">
					<xsl:value-of select="child::课程/课程编号"></xsl:value-of>
				</xsl:attribute>
				<xsl:attribute name="成绩性质">
					期末成绩
				</xsl:attribute>
				<xsl:element name="成绩">
					<xsl:element name="学号">
						<xsl:value-of select="ancestor::学生/个人基本信息/学号"></xsl:value-of>
					</xsl:element>
					<xsl:element name="得分">
						<xsl:value-of select="child::期末成绩"></xsl:value-of>
					</xsl:element>
				</xsl:element>
				
				
			</xsl:element>
			
		</xsl:for-each>
		
		<xsl:for-each select="/学生列表/学生/个人成绩/单科成绩">
			<xsl:sort select="child::课程/课程编号"></xsl:sort>
			<xsl:sort select="child::总评成绩"></xsl:sort>
			<xsl:element name="课程成绩">
				<xsl:attribute name="课程编号">
					<xsl:value-of select="child::课程/课程编号"></xsl:value-of>
				</xsl:attribute>
				<xsl:attribute name="成绩性质">
					总评成绩
				</xsl:attribute>
				<xsl:element name="成绩">
					<xsl:element name="学号">
						<xsl:value-of select="ancestor::学生/个人基本信息/学号"></xsl:value-of>
					</xsl:element>
					<xsl:element name="得分">
						<xsl:value-of select="child::总评成绩"></xsl:value-of>
					</xsl:element>
				</xsl:element>
				
				
			</xsl:element>
			
		</xsl:for-each>
	</xsl:element>
	
	

</xsl:template>


</xsl:stylesheet>

