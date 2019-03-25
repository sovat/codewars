package modify_xml.hadlers;

import modify_xml.dto.InstanceDataDTO;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.transform.TransformerException;
import java.util.ArrayList;

public class RemoveStyleHandler {
    private static String currentTagElement;
    private static String textStyleNoElement;


    private static String  xml =
            "<rvxml>\n" +
                    "<utext textstyleno=\"9\" tag=\"field_3185D9C971084A69BF6C74ABE66F3955\" br=\"0\">Дата начала случая</utext>\n" +
                    "<utext textstyleno=\"6\" br=\"0\">       </utext>\n" +
                    "<utext textstyleno=\"7\" br=\"0\">Осмотр педиатра при вызове на дом</utext>\n" +
                    "<utext textstyleno=\"7\" />\n" +
                    "<utext textstyleno=\"6\" parastyleno=\"2\">ФИО ребенка: </utext>\n" +
                    "<utext textstyleno=\"10\" tag=\"field_03AFF87FE8674055A80609BA49421D1C\" br=\"0\">Фамилия</utext>\n" +
                    "<utext textstyleno=\"6\" br=\"0\"> </utext>\n" +
                    "<utext textstyleno=\"11\" tag=\"field_292061B56D0E4E989DBF26983F266C63\" br=\"0\">Имя</utext>\n" +
                    "<utext textstyleno=\"6\" br=\"0\">  </utext>\n" +
                    "<utext textstyleno=\"12\" tag=\"field_08C9B794B85B4196894EADC9F733A51F\" br=\"0\">Отчество</utext>\n" +
                    "<utext textstyleno=\"6\" br=\"0\"> </utext>\n" +
                    "</rvxml>";


    public static void replaceValue() throws SAXException, TransformerException {

        ArrayList<InstanceDataDTO> list = new ArrayList<InstanceDataDTO>() {
            {
                add(new InstanceDataDTO("СТРОКА РАЗ", null, "3185D9C971084A69BF6C74ABE66F3955", null));
                add(new InstanceDataDTO("СТРОКА ДВА", null, "03AFF87FE8674055A80609BA49421D1C", null));
                add(new InstanceDataDTO("СТРОКА ТРИ", null, "292061B56D0E4E989DBF26983F266C63", null));

            }
        };


        XMLReader xr = new XMLFilterImpl(XMLReaderFactory.createXMLReader()) {
            private String tagName = "";

            @Override
            public void startElement(String uri, String localName, String qName, Attributes atts)
                    throws SAXException {
                tagName = qName;

                if (atts.getValue("tag") != null) {
                    currentTagElement = atts.getValue("tag");
                }
                if (atts.getValue("textstyleno") != null) {
                    textStyleNoElement = atts.getValue("textstyleno");
                }
                super.startElement(uri, localName, qName, atts);
            }

            public void endElement(String uri, String localName, String qName) throws SAXException {
                tagName = "";
                currentTagElement = "";
                textStyleNoElement = "";
                super.endElement(uri, localName, qName);
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                if (tagName.equals("utext")) {
                    for (InstanceDataDTO instanceDataDTO : list) {
                        if (currentTagElement.contains(instanceDataDTO.getTemplateFieldsRid())) {
                            String foo = instanceDataDTO.getBigValue() == null ? instanceDataDTO.getInstanceValue() : instanceDataDTO.getBigValue();
                            ch = foo.toCharArray();
                            start = 0;
                            length = ch.length;
                        }

                    }
                }
                super.characters(ch, start, length);
            }
        };


      /*  Source src = new SAXSource(xr, new InputSource(new StringReader(xml)));
        Result res = new StreamResult(System.out);


       TransformerFactory.newInstance().newTransformer().transform(src, res);*/
    }

}
