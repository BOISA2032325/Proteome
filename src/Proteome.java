import java.util.ArrayList;
import java.util.HashMap;

public class Proteome {

    HashMap<String, Proteine> map = new HashMap<>();

    public void ajouterProteine(Proteine proteine){
        map.put(proteine.getNomCourt(), proteine);
    }

    Proteine rechercherNomCourtExact(String nomCourt){
        return map.get(nomCourt);
    }

    public ArrayList<Proteine>rechercherNomLong(String nomLongRechercher){

        ArrayList<Proteine> listProt = new ArrayList<Proteine>();
        for (Proteine p: map.values()) {
            if (p.nomLong.contains(nomLongRechercher)){
                listProt.add(p);
            }
        }
        return listProt;
    }

    @Override
    public String toString() {
        return "Proteome{" +
                "map=" + map +
                '}';
    }
}
