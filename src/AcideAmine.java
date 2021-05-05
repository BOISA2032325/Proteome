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
        if (chaineAcide == null)
            throw new IllegalArgumentException("Oups rip");
        else {
            Pattern patternAcide = Pattern.compile("^(([1-9][0-9]*)*[ARNDCEQGHILKMFPSTWYV]+)*$");
            Matcher matcher = patternAcide.matcher(chaineAcide);
            boolean valide = matcher.find();
            return valide;
        }
    }

    Map<AcideAmines, Integer> lireAcideAmines(String sequence) {
         if (validationAcideAmine(sequence) == true){
             Map<AcideAmines, Integer> laMap = new HashMap<>();
             for (int i = 0; i < sequence.length(); i++) {
                 if (laMap.containsKey(AcideAmines.valueOf(sequence.substring(i, i+1))))
                     laMap.replace(AcideAmines.valueOf(sequence.substring(i, i+1)), laMap.get(AcideAmines.valueOf(sequence.substring(i, i+1)))+1);
                 else
                     laMap.put(AcideAmines.valueOf(sequence.substring(i, i+1)),+1);
             }
                 return laMap;
         }
         else
             throw new IllegalArgumentException("Oups rip");
    }


}

