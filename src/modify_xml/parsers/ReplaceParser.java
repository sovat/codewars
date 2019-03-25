package modify_xml.parsers;

import modify_xml.hadlers.ReplaceHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class ReplaceParser {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();
        ReplaceHandler replaceHandler = new ReplaceHandler();
        xmlReader.setContentHandler(replaceHandler);
        xmlReader.parse("C:\\Users\\belyakovds\\Desktop\\parse\\fileOut.xml");
    }

}
