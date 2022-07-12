/*xmldoc= new ActiveXObject("msxml2.DOMDocument.4.0");
xmldoc.validateOnParse = true;
xmldoc.load(url);*/

// Instantiate a DOM object.
var doc = new ActiveXObject("msxml2.DOMDocument.4.0");
doc.async = false;
doc.resolveExternals = true;
doc.validateOnParse = true;

//file="test.xml";
file="test1.xml";
//file="test9.xml";
// Load an XML file into the DOM instance.
doc.load(file);

// Display the content of the object.
alert("doc: "+doc.xml);
if(doc.xml=="")
	alert("Erreur");
else
	alert("Ok");

// Helper function:
function alert(str)
{
   WScript.Echo(str);
}
