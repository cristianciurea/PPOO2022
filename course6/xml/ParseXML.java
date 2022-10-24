package ro.ase.course6.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class ParseXML {

    public static Node getNodeByName(String nodeName, Node parentNode) throws Exception {

        if (parentNode.getNodeName().equals(nodeName)) {
            return parentNode;
        }

        NodeList list = parentNode.getChildNodes();
        for (int i = 0; i < list.getLength(); i++)
        {
            Node node = getNodeByName(nodeName, list.item(i));
            if (node != null) {
                return node;
            }
        }
        return null;
    }

    public static String getAttributeValue(Node node, String attrName) {
        try {
            return ((Element)node).getAttribute(attrName);
        }
        catch (Exception e) {
            return "";
        }
    }

    public void Parse() {

        String adresaWeb = "https://pastebin.com/raw/L1QqC6Qk";

        try {
            //creare parser care genereaza obiecte DOM din fisiere XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            //creare instanta DOM din fisier XML
            DocumentBuilder db = dbf.newDocumentBuilder();
            //parsare
            //Document domDoc = db.parse(isr);
            Document domDoc = db.parse(adresaWeb);
            //structurare continut fisier
            domDoc.getDocumentElement().normalize();

            //accesare nod cu ratele de schimb
            Node parinte = getNodeByName("Vehicles", domDoc.getDocumentElement()); //Vehicles
            if (parinte != null) {

                System.out.println("Parintele este "+parinte.getNodeName());

                //parcurgere lista de fii (tag-urile Tag)
                NodeList listaCopiiParinte = parinte.getChildNodes(); //Vehicle
                for (int j = 0; j < listaCopiiParinte.getLength(); j++) {
                    //extrag fiecare nod din lista
                    Node copil = listaCopiiParinte.item(j); //Vehicle

                    System.out.println("Copilul este "+copil.getNodeName());

                    //accesare nod cu ratele de schimb
                    //Node cube = getNodeByName("Vehicle", domDoc.getDocumentElement());
                    if (copil != null && copil.getNodeName().equals("Vehicle")) {

                        Vehicle vehicle = new Vehicle();

                        //parcurgere lista de fii (tag-urile Tag)
                        NodeList taguri = copil.getChildNodes();
                        for (int i = 0; i < taguri.getLength(); i++) {
                            //extrag fiecare nod din lista
                            Node tag = taguri.item(i);

                            //extrag atribut nod
                            String attribute = getAttributeValue(tag, "atribut");

                            if (attribute.equals("BrandAuto"))
                                vehicle.setBrandAuto(tag.getTextContent());

                            if (attribute.equals("ModelAuto"))
                                vehicle.setModelAuto(tag.getTextContent());

                            if (attribute.equals("Date"))
                                vehicle.setDate(new Date(tag.getTextContent()));

                            if (attribute.equals("Price"))
                                vehicle.setPrice(Integer.parseInt(tag.getTextContent()));

                            if (attribute.equals("EngineType"))
                                vehicle.setEngineType(tag.getTextContent());

                            if (attribute.equals("Transmission"))
                                vehicle.setTransmission(tag.getTextContent());
                        }

                        System.out.println(vehicle.toString());
                    }
                }
            }

        } catch (SAXException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ParseXML xml = new ParseXML();
        xml.Parse();

    }
}
