!ifndef FICHIER_EXEC
FICHIER_EXEC = test1.exe
!endif

# 

help:
	@echo compj : compilation du compilateur en java
	@echo run5 : execution du compilateur Eiffel
	@echo compc3 : compilation du C
	@echo help : affiche l'aide
	@echo -DFICHIER_EXEC=exec.exe compc3 : compilation pour generer le fichier exec.exe
	@echo test_allc : tous les tests
	@echo test_simple2 : un seul test
	@echo test_unitaire : les testes unitaires
	@echo test_parser : les testes du parser

all:
	java antlr.Tool -o compiler compiler\eiffel.g
        java antlr.Tool -o lace lace\ace.g
	javac -source 1.4 ast\*.java compiler\*.java

ace:
        java antlr.Tool -o lace lace\ace.g
	javac -source 1.4 ast\*.java compiler\*.java lace\*.java


run:
	java -ea compiler.Eiffel <test1.in

run2:
	java compiler.Eiffel <test1.in >toto.txt

run3:
	redir -t java compiler.Eiffel <test1.in >toto.txt

run40:
        java -classpath test_unitaire\junit.jar;.;D:\java\xerces-2_5_0\xercesImpl.jar;D:\java\xerces-2_5_0\xml-apis.jar;D:\java\xerces-2_5_0\xmlParserAPIs.jar;D:\java\antlr-2.7.3\antlr.jar -ea test_unitaire.TestXmlSimple


run4:
        java -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar;c:\antlr-2.7.3\antlr.jar -ea test_unitaire.TestXmlSimple

run5:
        java -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar;c:\antlr-2.7.3\antlr.jar -ea compiler.Eiffel

run6:
        java -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar;c:\antlr-2.7.3\antlr.jar -ea compiler.Eiffel >result.txt

run7:
        redir -e toto.txt java -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar;c:\antlr-2.7.3\antlr.jar -ea compiler.Eiffel

exec2:
	test1.exe

exec:
        c:\j2sdk1.4.0\jre\bin\java.exe -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar;c:\antlr-2.7.3\antlr.jar -ea compiler.Eiffel

compc2:
	bcc32 genere_c\main.cpp

compc:
	bcc32 genere_c\test1.cpp

SRC_C = genere_c\test1.c genere_c\programme.c genere_c\debug.c genere_c\extern_fun.c genere_c\memoire.c genere_c\erreur.c genere_c\runtime.c genere_c\interprete.c

# bcc32 -w- -vG -y -v genere_c\test1.c genere_c\programme.c genere_c\interprete.c -e$(FICHIER_EXEC) c:\bcc32\lib\cg32.lib
#-w-
#-P
#-d
compc3:
	bcc32 -P -y -v -d -DMSS $(SRC_C) e:\projet\eiffel\genere_c\mss121\mss32.lib -e$(FICHIER_EXEC)

compc4:
	bcc32  -y -v $(SRC_C) -e$(FICHIER_EXEC)

compc5:
	bcc32 -w- -vG -y -v $(SRC_C) -e$(FICHIER_EXEC) c:\bcc32\lib\cg32.lib

compj:
	ant

clean:
	del compiler\*.class
	del ast\*.class

comp_test:
	javac -source 1.4 -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar test_unitaire\Test_unitaire1.java

test:
	java -ea -classpath test_unitaire\junit.jar;.;c:\antlr-2.7.2;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar test_unitaire.Test_unitaire1

test2:
	java -ea -classpath test_unitaire\junit.jar;.;c:\antlr-2.7.2;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar junit.awtui.TestRunner test_unitaire.Test_unitaire1

comp_test3:
	javac -source 1.4 -classpath .;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar test_unitaire\ParserXML.java

test3:
	java -ea -classpath .;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar test_unitaire.ParserXML

test4:
	javac -classpath .;test_unitaire\junit.jar test_unitaire\TestXmlSimple.java
	java -ea -classpath .;test_unitaire\junit.jar test_unitaire.TestXmlSimple

test5:
	java -ea -classpath .;test_unitaire\junit.jar test_unitaire.TestXmlSimple


parser_html:
	java antlr.Tool -html -o .\ compiler\eiffel.g

comp_compare:
	javac -source 1.4  -classpath .;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar outils\compare_xml\Compare_XML.java

compare:
	java -ea -classpath .;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar  outils.compare_xml.Compare_XML

test6:
	javac -source 1.4 -classpath .;test_unitaire\junit.jar test_unitaire\VerifieContextErreur.java
	java -ea -classpath .;test_unitaire\junit.jar;c:\antlr-2.7.2\antlr.jar test_unitaire.VerifieContextErreur

test_allc:
	@echo Debut des tests >test_resultat.txt
	echo Debut des tests 
	make -DFICHIER_COMPILE=test\genc\int_basic2\test1.e -DFICHIER_REFERENCE=test\genc\int_basic2\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\bool_basic\test1.e -DFICHIER_REFERENCE=test\genc\bool_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\char_basic\test1.e -DFICHIER_REFERENCE=test\genc\char_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\str_basic\test1.e -DFICHIER_REFERENCE=test\genc\str_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\real_basic\test1.e -DFICHIER_REFERENCE=test\genc\real_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\dbl_basic\test1.e -DFICHIER_REFERENCE=test\genc\dbl_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\creation_basic\test1.e -DFICHIER_REFERENCE=test\genc\creation_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\appel_basic\test1.e -DFICHIER_REFERENCE=test\genc\appel_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\loop_basic\test1.e -DFICHIER_REFERENCE=test\genc\loop_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\if_basic\test1.e -DFICHIER_REFERENCE=test\genc\if_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\compare_basic\test1.e -DFICHIER_REFERENCE=test\genc\compare_basic\trace.log test_simple1
	make -DFICHIER_COMPILE=test\genc\rattachement_basic\test1.e -DFICHIER_REFERENCE=test\genc\rattachement_basic\trace.log test_simple1
	@echo Fin des tests : Aucun probleme
	@echo Fin des tests : Aucun probleme >>test_resultat.txt

# test\genc\test001.e
test_simple1:
	@echo Compilation de $(FICHIER_COMPILE) >>test_resultat.txt
	java -classpath test_unitaire\junit.jar;.;E:\java\xerces-2_5_0\xercesImpl.jar;E:\java\xerces-2_5_0\xmlParserAPIs.jar;c:\antlr-2.7.3\antlr.jar -ea compiler.Eiffel $(FICHIER_COMPILE)
	@echo Compilation C >>test_resultat.txt
	make compc3
	@echo Execution de test1.exe >>test_resultat.txt
	test1.exe
	@echo Comparaison des trace.log >>test_resultat.txt
	cmp trace.log $(FICHIER_REFERENCE) >>test_resultat.txt
	@echo Fin compilation de $(FICHIER_COMPILE) >>test_resultat.txt

#make -DFICHIER_COMPILE=test\genc\int_basic2\test1.e -DFICHIER_REFERENCE=test\genc\int_basic2\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\bool_basic\test1.e -DFICHIER_REFERENCE=test\genc\bool_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\char_basic\test1.e -DFICHIER_REFERENCE=test\genc\char_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\real_basic\test1.e -DFICHIER_REFERENCE=test\genc\real_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\dbl_basic\test1.e -DFICHIER_REFERENCE=test\genc\dbl_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\str_basic\test1.e -DFICHIER_REFERENCE=test\genc\str_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\int_basic\test1.e -DFICHIER_REFERENCE=test\genc\int_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\appel_basic\test1.e -DFICHIER_REFERENCE=test\genc\appel_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\creation_basic\test1.e -DFICHIER_REFERENCE=test\genc\creation_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\loop_basic\test1.e -DFICHIER_REFERENCE=test\genc\loop_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\if_basic\test1.e -DFICHIER_REFERENCE=test\genc\if_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\compare_basic\test1.e -DFICHIER_REFERENCE=test\genc\compare_basic\trace.log test_simple1
#make -DFICHIER_COMPILE=test\genc\rattachement_basic\test1.e -DFICHIER_REFERENCE=test\genc\rattachement_basic\trace.log test_simple1

#make -DFICHIER_COMPILE=test\genc\general_basic\test1.e -DFICHIER_REFERENCE=test\genc\general_basic\trace.log test_simple1

test_simple2:
	make -DFICHIER_COMPILE=test\genc\general_basic\test1.e -DFICHIER_REFERENCE=test\genc\general_basic\trace.log test_simple1

# -classpath .;C:\antlr-2.7.2\antlr.jar -deprecation
# -traceTreeParser -diagnostic -trace
# -eo  *.java

test0:
	java -ea -classpath .;test_unitaire\junit.jar test_unitaire.TestAll

test_unitaire:
	redir -o toto1.txt ant test2
	@echo Les tests sont terminés (toto1.txt)

test_parser:
	redir -o toto1.txt ant test3
	@echo Les tests sont terminés (toto1.txt)

#javac -source 1.4 compiler\Parser.java
#java -ea compiler.Parser test\test13.e
#
#

parse:
	javac -source 1.4 compiler\Parser.java

parse2:
	java -ea compiler.Parser test\test13.e
