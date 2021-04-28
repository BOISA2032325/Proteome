import org.w3c.dom.Document;
import org.w3c.dom.Element;
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





        System.out.println("baptiser la proteine 1");
        Proteines proteines1 = new Proteines(sc.next());
        proteome.ajouterProteine(proteines1);
        System.out.println(proteome.rechercherNomCourtExact("ABC"));

        System.out.println("baptiser la proteine 2");
        Proteines proteines2 = new Proteines(sc.next());
        proteome.ajouterProteine(proteines2);
        System.out.println(proteome.rechercherNomCourtExact("DEF"));

        System.out.println("baptiser la proteine 3");
        Proteines proteines3 = new Proteines(sc.next());
        proteome.ajouterProteine(proteines3);
        System.out.println(proteome.rechercherNomCourtExact("GHI"));

        AcideAmine acideAmine = new AcideAmine();
        System.out.println(acideAmine.lireAcideAmines("AAAAGG"));
        System.out.println(acideAmine.lireAcideAmines("GAGA"));
        System.out.println(acideAmine.lireAcideAmines("GDEFF"));


        //Affichage du menu de base

        File ficher = new File("/Users/sambp/IdeaProjects/Proteome/out/chien.xml");
        Proteome proteome;
        ChargeurXML chargeurXML = new ChargeurXML();
        proteome = chargeurXML.chargeur();
        System.out.println(proteome);


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
