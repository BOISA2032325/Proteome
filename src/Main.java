import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

    //Projet fait par Mathis Fortin et Samuel Boivin-Pigeon

    public static void main(String[]args) {

        //Variable

        Scanner sc = new Scanner(System.in);
        String choixUtilisateurDansLeMenu;
        Proteome proteome = new Proteome();

        try {

            File ficher = new File("/Users/sambp/IdeaProjects/Proteome/out/chien.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(ficher);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("name");
            for (int temp = 0; temp < nodeList.getLength(); temp++){
                Node node = nodeList.item(temp);
                System.out.println("\nCurrentElement :" + nodeList.getLength());
            }




        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }






        //Affichage du menu de base

        File ficher = new File("/Users/sambp/IdeaProjects/Proteome/out/chien.xml");

        /*try(Stream <String> sf = Files.lines(Paths.get(String.valueOf(ficher)))) {
            sf.forEach(System.out ::println);
        } catch (IOException e){
            e.printStackTrace();
        }

         */



        System.out.println("**************************************************************************************");
        System.out.println("Bonjour utilisateur bienvenu dans le programme proténome");
        System.out.println("Ce programme sert a synthetiser des proteine");

        do {

            System.out.println("Voici le menu principal : ");
            System.out.println("- Pour entrer une proteine entrer la lettre E");
            System.out.println("- Pour quitter le programme entrer la lettre Q");
            System.out.println("- Pour obtenir la liste des acide entrer la lettre O");
            System.out.println("- Pour chercher une proteine par sont nom écrire C");

            choixUtilisateurDansLeMenu = sc.next();
            choixUtilisateurDansLeMenu.toUpperCase();

            if (choixUtilisateurDansLeMenu.equals("O")){

                for (AcideAmine.AcideAmines variable : AcideAmine.AcideAmines.values()){
                    System.out.println("- Abréviation courte: " + variable + " Nom complet: " + variable.getAcideAmine() + " Abréviation: " + variable.getAbreviationlongue());
                }

            }

            if (choixUtilisateurDansLeMenu.equals("E")){

                String choixDuMenu;

                do {

                    AcideAmine acideAmine = new AcideAmine();

                    System.out.println("Pour ecrire une chaine d'acide ecrire E");
                    System.out.println("Pour retourner au menu principal écrire R");
                    choixDuMenu = sc.next();

                    if (choixDuMenu.equals("E")){

                        System.out.println("Veuillez écrire la chaine d'acide");
                        String sequenceAcideVoulu = sc.next();
                        System.out.println(acideAmine.lireAcideAmines(sequenceAcideVoulu));
                    }

                }while (!choixDuMenu.equals("R"));


            }

        }while (!choixUtilisateurDansLeMenu.equals("Q"));





    }
}
