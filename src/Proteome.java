import java.util.ArrayList;
import java.util.HashMap;

public class Proteome {

    HashMap<String, Proteines> map = new HashMap<>();

    public void ajouterProteine(Proteines proteines){
        map.put(proteines.getNomCourt(), proteines);
    }

    // REB : Choisir une visibilité
    Proteines rechercherNomCourtExact(String nomCourt){
        return map.get(nomCourt);
    }
}
