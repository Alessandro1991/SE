package orderprocessing;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

class POHandler extends DefaultHandler {

  public void startElement(String uri, String name,
                           String qName, Attributes attrs) {
    if ("".equals (uri))
      System.out.println("Start element: " + qName);
    else
      System.out.println("Start element: {" + uri + "}" + name);

    for( int i=0; i<attrs.getLength(); i++ ){
	System.out.println( "\tAttribute-Name: " + attrs.getLocalName(i)
			    + " Value: "     + attrs.getValue(i) );
}
  }

  public void endElement (String uri, String name, String qName){
    if ("".equals (uri))
      System.out.println("End element: " + qName);
    else
      System.out.println("End element:   {" + uri + "}" + name);
  }

  public void characters (char ch[], int start, int length){
    System.out.print("Characters:    \"");
    for (int i = start; i < start + length; i++) {
      System.out.print(ch[i]);
    }
    System.out.print("\"\n");
  }

public static void main (String [] args) throws Exception {
   SAXParserFactory factory = SAXParserFactory.newInstance();
   SAXParser saxParser = factory.newSAXParser();
   DefaultHandler handler = new POHandler();
   
   // Parse each file provided on the command line.
   for (int i = 0; i < args.length; i++) {
      saxParser.parse( new File(args[i]), handler ); 
   }
}

}
