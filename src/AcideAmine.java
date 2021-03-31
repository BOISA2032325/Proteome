import java.util.Map;

public enum AcideAmine {

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


    private String acideAminé;
    private String Abréviationlongue;


    AcideAmine(String acideAminé, String abréviationlongue) {
        this.acideAminé = acideAminé;
        Abréviationlongue = abréviationlongue;

    }

    Map<AcideAmine, Integer> lireAcideAmines(String sequence) {
        return null;
    }


}
