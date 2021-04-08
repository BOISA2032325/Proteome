import java.util.HashMap;
import java.util.Map;
public class  AcideAmine {

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
        V("Valine", "Val");

        // REB : Devraient être finaux
        private String acideAmine;
        private String abreviationlongue;


        AcideAmines(String acideAmine, String abreviationlongue) {
            this.acideAmine = acideAmine;
            this.abreviationlongue = abreviationlongue;

        }
    }

    // REB : Choisir une visibilité (public ou privée)
    // REB : la séquence n'est pas validée
    Map<AcideAmines, Integer> lireAcideAmines(String sequence) {
        Map<AcideAmines, Integer> laMap = new HashMap<>();
        for (int i = 0; i < sequence.length(); i++) {
            if (laMap.containsKey(AcideAmines.valueOf(sequence.substring(i, i+1))))
                laMap.replace(AcideAmines.valueOf(sequence.substring(i, i+1)), laMap.get(AcideAmines.valueOf(sequence.substring(i, i+1)))+1);
            else
                laMap.put(AcideAmines.valueOf(sequence.substring(i, i+1)),+1);
        }
        return laMap;
    }
}

