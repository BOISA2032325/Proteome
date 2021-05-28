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


    public HashMap<AcideAmine.AcideAmines, Integer> mapAcideParProt (Map mapUti){
        for (Proteine p: mapDeProts.values()) {
            AcideAmine.lireAcideAmines(p.sequenceAcide);
            HashMap<AcideAmine.AcideAmines, Integer> mapAcide = new HashMap<>();
            mapAcide = (HashMap<AcideAmine.AcideAmines, Integer>) AcideAmine.lireAcideAmines(p.sequenceAcide);

            if (mapAcide.containsValue(mapUti)){

                return mapAcide;

            }


        }

        return null;
    }

    @Override
    public String toString() {
        return "Proteome{" +
                "map=" + mapDeProts +
                '}';
    }
}
