import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ChargeurXML {

    String choixDeVivants;


    public void choixDeVivant(String choixDeVivants){
        this.choixDeVivants = choixDeVivants;
    }

    public Proteome chargeur(){

        if (choixDeVivants.equals("chien")){


            try {
                //tfeuyt

                File ficher = new File("/Users/sambp/IdeaProjects/Proteome/out/chien.xml");
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document = documentBuilder.parse(ficher);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("entry");

                Proteome proteome = new Proteome();

                for (int temp = 0; temp < nodeList.getLength(); temp++){

                    Node node = nodeList.item(temp);


                    if (node.getNodeType() == Node.ELEMENT_NODE){

                        Element element = (Element) node;
                        Proteines proteines1 = new Proteines();

                        proteines1.setNomLong(element.getElementsByTagName("fullName").item(0).getTextContent());
                        proteines1.setNomCourt(element.getElementsByTagName("name").item(0).getTextContent());
                        proteines1.setSequenceAcide(element.getElementsByTagName("sequence").item(0).getTextContent());
                        proteome.ajouterProteine(proteines1);

                    }
                }

                return proteome;


            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }

        }else if (choixDeVivants.equals("humain")){

            try {

                File ficher2 = new File("/Users/sambp/IdeaProjects/Proteome/out/humain.xml");
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document = documentBuilder.parse(ficher2);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("entry");

                Proteome proteome = new Proteome();

                for (int temp = 0; temp < nodeList.getLength(); temp++){

                    Node node = nodeList.item(temp);


                    if (node.getNodeType() == Node.ELEMENT_NODE){

                        Element element = (Element) node;
                        Proteines proteines1 = new Proteines();

                        proteines1.setNomLong(element.getElementsByTagName("fullName").item(0).getTextContent());
                        proteines1.setNomCourt(element.getElementsByTagName("name").item(0).getTextContent());
                        proteines1.setSequenceAcide(element.getElementsByTagName("sequence").item(0).getTextContent());
                        proteome.ajouterProteine(proteines1);

                    }
                }

                return proteome;


            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }

        }else if(choixDeVivants.equals("chimpanze")){


            try {

                File ficher2 = new File("/Users/sambp/IdeaProjects/Proteome/out/chimpanze.xml");
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                Document document = documentBuilder.parse(ficher2);
                document.getDocumentElement().normalize();
                NodeList nodeList = document.getElementsByTagName("entry");

                Proteome proteome = new Proteome();

                for (int temp = 0; temp < nodeList.getLength(); temp++){

                    Node node = nodeList.item(temp);


                    if (node.getNodeType() == Node.ELEMENT_NODE){

                        Element element = (Element) node;
                        Proteines proteines1 = new Proteines();

                        proteines1.setNomLong(element.getElementsByTagName("fullName").item(0).getTextContent());
                        proteines1.setNomCourt(element.getElementsByTagName("name").item(0).getTextContent());
                        proteines1.setSequenceAcide(element.getElementsByTagName("sequence").item(0).getTextContent());
                        proteome.ajouterProteine(proteines1);

                    }
                }

                return proteome;


            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }

        }

        return null;
    }

}
