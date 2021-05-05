import java.util.HashMap;

public class Proteome {

    HashMap<String, Proteine> map = new HashMap<>();

    public void ajouterProteine(Proteine proteine){
        map.put(proteine.getNomCourt(), proteine);
    }

    Proteine rechercherNomCourtExact(String nomCourt){
        return map.get(nomCourt);
    }

    @Override
    public String toString() {
        return "Proteome{" +
                "map=" + map +
                '}';
    }
}
