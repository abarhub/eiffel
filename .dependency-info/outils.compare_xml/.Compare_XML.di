       5E:\projet\eiffel\outils\compare_xml\Compare_XML.class outils.compare_xml.Compare_XML java.lang.Object Compare_XML.java   !        	msgErreur Ljava/lang/String;    nom1 Ljava/lang/String;    nom2 Ljava/lang/String;    ligne1 I    colonne1 I    ligne2 I    colonne2 I      	 main ([Ljava/lang/String;)V   	     erreur ()Ljava/lang/String;        parse ()Z        avance (Lorg/w3c/dom/Element;I)I        <init> '(Ljava/lang/String;Ljava/lang/String;)V        setError -(Lorg/w3c/dom/Element;Lorg/w3c/dom/Element;)V        diff >(Lorg/w3c/dom/Element;Lorg/w3c/dom/Element;)Ljava/lang/String;        diff )(Lorg/w3c/dom/Element;)Ljava/lang/String;        compare -(Lorg/w3c/dom/Element;Lorg/w3c/dom/Element;)Z           test_unitaire.TestXmlSimple    <init> '(Ljava/lang/String;Ljava/lang/String;)V         parse ()Z         erreur ()Ljava/lang/String;            java.lang.String      +javax.xml.parsers.FactoryConfigurationError      java.lang.Class      org.w3c.dom.Node      org.w3c.dom.Text      java.lang.Object      java.util.HashMap      !javax.xml.parsers.DocumentBuilder       java.lang.ClassNotFoundException      java.lang.System      org.w3c.dom.NodeList      org.w3c.dom.Document      .javax.xml.parsers.ParserConfigurationException      java.lang.StringBuffer      java.io.IOException      org.w3c.dom.Element      org.w3c.dom.NamedNodeMap      java.io.PrintStream      java.lang.NoClassDefFoundError      (javax.xml.parsers.DocumentBuilderFactory      org.xml.sax.SAXException      java.lang.AssertionError     