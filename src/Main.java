
import java.util.Map;
import java.util.Scanner;
public class Main {

    //Projet fait par Mathis Fortin et Samuel Boivin-Pigeon

    public static void main(String[]args) {

        //Variable

        Scanner sc = new Scanner(System.in);
        String choixUtilisateurDansLeMenu;
        String choixDuVivantMain;
        Proteome proteome = null;
        ChargeurXML chargeurXML = new ChargeurXML();

        //Affichage du menu de base

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

            //Menu si utilisateur souhaite afficher la liste des acides

            if (choixUtilisateurDansLeMenu.equals("O")){

                for (AcideAmine.AcideAmines variable : AcideAmine.AcideAmines.values()){
                    System.out.println("- Abréviation courte: " + variable + " Nom complet: " + variable.getAcideAmine() + " Abréviation: " + variable.getAbreviationlongue());
                }
            }

            //Menu si utilisateur souhaite rechercher une protéine

            if (choixUtilisateurDansLeMenu.equals("E")){

                String choixDuMenu;

                do {
                    System.out.println("Pour confirmer votre choix de menu écrire E");
                    System.out.println("Pour retourner au menu principal écrire R");
                    choixDuMenu = sc.next();

                    if (choixDuMenu.equals("E")){

                        Proteine proteineVoulu = new Proteine();


                        System.out.println("Afin de choisir veuillez écrire le nom court du vivant");
                        choixDuVivantMain = sc.next().toLowerCase();
                        chargeurXML.choixDeVivant(choixDuVivantMain);
                        proteome = chargeurXML.chargeur();

                        System.out.println("Pour afficher le proteome choisie écrire A");
                        System.out.println("Pour faire une recherche a l'aide d'acide écrire B");
                        System.out.println("Pour faire une recherche a l'aide du nom court écrire C");
                        System.out.println("Pour faire une recherche a l'aide du nom long écrire D");
                        choixDuMenu = sc.next();
                        char charChoixDuMenu = choixDuMenu.charAt(0);

                        switch (charChoixDuMenu){
                            case 'A':
                                System.out.println(proteome);
                                break;
                            case 'B':
                                AcideAmine acideAmine = new AcideAmine();
                                System.out.println("Entrez la chaine d'acide");
                                String chaineAcide = sc.next().toUpperCase();
                                Map<AcideAmine.AcideAmines, Integer> mapUti;
                                mapUti = acideAmine.lireAcideAmines(chaineAcide);
                                proteome.mapAcideParProt(mapUti);
                                break;
                            case 'C':
                                System.out.println("Écrire le nom court voulu");
                                String nomCourtVoulu = sc.next();
                                proteineVoulu = proteome.rechercherNomCourtExact(nomCourtVoulu);
                                System.out.println(proteineVoulu);
                                break;
                            case 'D':
                                System.out.println("Ecrire le nom long voulu");
                                String nomLongVoulu = sc.next();
                                System.out.println(proteome.rechercherNomLong(nomLongVoulu));
                                break;
                        }

                    }

                }while (!choixDuMenu.equals("R"));


            }

        }while (!choixUtilisateurDansLeMenu.equals("Q"));

    }
}
