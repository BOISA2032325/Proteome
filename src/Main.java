import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[]args) {

        //Variable

        Scanner sc = new Scanner(System.in);
        String choixUtilisateurDansLeMenu;


        //Affichage du menu de base

        System.out.println("**************************************************************************************");
        System.out.println("Bonjour utilisateur bienvenu dans le programme proténome");
        System.out.println("Ce programme sert a synthetiser des proteine");

        do {

            System.out.println("Voici le fonctionnement du programme : ");
            System.out.println("- Pour entrer une proteine entrer la lettre E");
            System.out.println("- Pour quitter le programme entrer la lettre Q");
            System.out.println("- Pour obtenir la liste des acide entrer la lettre O");

            choixUtilisateurDansLeMenu = sc.next();
            choixUtilisateurDansLeMenu.toUpperCase();

        }while (!choixUtilisateurDansLeMenu.equals("Q"));





    }
}
