import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AcideAmine {

     public enum AcideAmines {

        A("Alanine", "Ala"),
        R("Arginine", "Arg"),
        N("Asparagine","Asn"),
        D("Dspartate", "Asp"),
        C("Cystéine", "Cys"),
        E("Glutamate", "Glu"),
        Q("Glutamine", "Gln"),
        G("Glycine", "Gly"),
        H("Histidine", "His"),
        I("Isoleucine", "Ile"),
        L("Leucine", "Leu"),
        K("Lysine", "Lys"),
        M("Méthionine", "Met"),
        F("Phénylalanine", "Phe"),
        P("Proline", "Pro"),
        S("Serine", "Ser"),
        T("Thréonine", "Thr"),
        W("Tryptophane", "Trp"),
        Y("Tyrosine", "Tyr"),
        V("Valine", "Val"),
        O("Pyrrolysine","Pyl"),
        U("Sélénocystéine","Sec");


        private String acideAmine;
        private String abreviationlongue;

        AcideAmines(String acideAmine, String abreviationlongue) {
            this.acideAmine = acideAmine;
            this.abreviationlongue = abreviationlongue;

        }

        public String getAcideAmine() {
             return acideAmine;
        }

        public String getAbreviationlongue(){
            return abreviationlongue;
        }
     }

     //Validation chaine

    static boolean validationAcideAmine(String chaineAcide){
        if (chaineAcide == null) {
            throw new IllegalArgumentException("Chaine vide");
        }else {
            Pattern patternAcide = Pattern.compile("^(([1-9][0-9]*)*[ARNDCEQGHILKMFPSTWYVOU]+)*$");
            Matcher matcher = patternAcide.matcher(chaineAcide);
            boolean valide = matcher.find();
            return true;
        }
    }



    public static Map<AcideAmines, Integer> lireAcideAmines(String sequence) {
         int nbAcideAmine = 0;
         if (validationAcideAmine(sequence)){
             Map<AcideAmines, Integer> laMap = new HashMap<>();
             Pattern acideAmineTrouve = Pattern.compile("[ARNDCEQGHILKMFPSTWYVOU]");
             for (int i = 0; i < sequence.length(); i++) {
                 if(sequence.substring(i, i+1).matches(acideAmineTrouve.toString())){

                     if (laMap.containsKey(AcideAmines.valueOf(sequence.substring(i, i+1)))) {
                         laMap.replace(AcideAmines.valueOf(sequence.substring(i, i + 1)), laMap.get(AcideAmines.valueOf(sequence.substring(i, i + 1))) + nbAcideAmine);
                     }else
                         laMap.put(AcideAmines.valueOf(sequence.substring(i, i+1)),+nbAcideAmine);
                 }else

                     do{
                         if(nbAcideAmine == 0) {
                             nbAcideAmine = 1;
                         }else
                             nbAcideAmine = nbAcideAmine * 10 + sequence.charAt(i);
                             i++;
                     }while (sequence.substring(nbAcideAmine, nbAcideAmine+1).matches(acideAmineTrouve.toString()));
             }
             return laMap;
         }
         else
             throw new IllegalArgumentException("Oups rip");
    }
}