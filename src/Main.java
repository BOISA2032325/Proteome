import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class Main {

    //Projet fait par Mathis Fortin et Samuel Boivin-Pigeon

    public static void main(String[]args) {

        //Variable

        Scanner sc = new Scanner(System.in);
        String choixUtilisateurDansLeMenu;
        Proteome proteome = new Proteome();


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


        System.out.println("**************************************************************************************");
        System.out.println("Bonjour utilisateur bienvenu dans le programme proténome");
        System.out.println("Ce programme sert a synthetiser des proteine");

        do {

            System.out.println("Voici le menu principal : ");
            System.out.println("- Pour entrer une proteine entrer la lettre E");
            System.out.println("- Pour quitter le programme entrer la lettre Q");
            System.out.println("- Pour obtenir la liste des acide entrer la lettre O");

            choixUtilisateurDansLeMenu = sc.next();
            choixUtilisateurDansLeMenu.toUpperCase();

            if (choixUtilisateurDansLeMenu.equals("O")){

                for (AcideAmine.AcideAmines variable : AcideAmine.AcideAmines.values()){
                    System.out.println("- Abréviation courte: " + variable + " Nom complet: " + variable.getAcideAmine() + " Abréviation: " + variable.getAbreviationlongue());
                }

            }

            if (choixUtilisateurDansLeMenu.equals("E")){

            }



        }while (!choixUtilisateurDansLeMenu.equals("Q"));





    }
}
