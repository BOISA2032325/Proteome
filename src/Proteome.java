import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Proteome {

    HashMap<String, Proteine> mapDeProts = new HashMap<>();


    public void ajouterProteine(Proteine proteine){
        mapDeProts.put(proteine.getNomCourt(), proteine);
    }

    //Recherche par nom cour

    Proteine rechercherNomCourtExact(String nomCourt){
        return mapDeProts.get(nomCourt);
    }

    //Recherche par nom long

    public ArrayList<Proteine>rechercherNomLong(String nomLongRechercher){
        ArrayList<Proteine> listProt = new ArrayList<Proteine>();
        for (Proteine p: mapDeProts.values()) {
            if (p.nomLong.contains(nomLongRechercher)){
                listProt.add(p);
            }
        }
        return listProt;
    }

    public Map <AcideAmine, String> mapAcideParProt (){
        for (Proteine p: mapDeProts.values()) {
            AcideAmine.validationAcideAmine(p.sequenceAcide);
            HashMap<AcideAmine, Integer> mapAcide = new HashMap<>();

        }
    }

    public HashMap<AcideAmine, Proteine> comparerLesMaps(Map mapUtiValidé){
        for (int i = 0; i < mapDeProts.size(); i++) {
            if(mapDeProts.containsValue(mapUtiValidé) == mapDeProts.containsKey(i) || mapDeProts.containsValue(mapUtiValidé))


        }

    }

    public List<Proteine> rechercherParAcide (Map mapUtiValidé){



    }

    @Override
    public String toString() {
        return "Proteome{" +
                "map=" + mapDeProts +
                '}';
    }
}
