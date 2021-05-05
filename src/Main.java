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
        String choixDuVivantMain;



        //Affichage du menu de base

        Proteome proteome = null;
        ChargeurXML chargeurXML = new ChargeurXML();



        System.out.println("**************************************************************************************");
        System.out.println("Bonjour utilisateur bienvenu dans le programme proténome");
        System.out.println("Ce programme sert a synthetiser des proteine");

        do {

            System.out.println("Voici le menu principal : ");
            System.out.println("- Pour entrer une proteine entrer la lettre E");
            System.out.println("- Pour obtenir la liste des acide entrer la lettre O");
            System.out.println("- Pour quitter le programme entrer la lettre Q");

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
                    System.out.println("Pour confirmer votre choix de menu écrire E");
                    System.out.println("Pour retourner au menu principal écrire R");
                    choixDuMenu = sc.next();

                    if (choixDuMenu.equals("E")){

                        System.out.println("Afin de choisir veuillez écrire le nom court de la proteine");
                        choixDuVivantMain = sc.next().toLowerCase();
                        chargeurXML.choixDeVivant(choixDuVivantMain);

                        System.out.println("Pour afficher le proteome choisie écrire A");
                        System.out.println("Pour faire une recherche a l'aide d'acide écrire B");
                        System.out.println("Pour faire une recherche a l'aide du nom court ecrire C");
                        choixDuMenu = sc.next();
                        char charChoixDuMenu = choixDuMenu.charAt(0);

                        switch (charChoixDuMenu){
                            case 'A':
                                proteome = chargeurXML.chargeur();
                                System.out.println(proteome);
                                break;
                            case 'B':
                                break;
                            case 'C':
                                String nomCourtVoulu = sc.next();
                                assert proteome != null;
                                proteome.rechercherNomCourtExact(nomCourtVoulu);
                                break;
                        }

                    }

                }while (!choixDuMenu.equals("R"));


            }
        }while (!choixUtilisateurDansLeMenu.equals("Q"));

    }
}
