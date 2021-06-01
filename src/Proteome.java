import java.util.*;

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

    //HashMap<AcideAmine.AcideAmines, Integer> mapAcideParProt (Map mapUti)

    public ArrayList<Proteine>mapAcideParProt (String sequences){
        HashMap<AcideAmine.AcideAmines, Integer> mapUti = new HashMap<>();
        mapUti = (HashMap<AcideAmine.AcideAmines, Integer>) AcideAmine.lireAcideAmines(sequences);
        ArrayList<Proteine> listAcide = new ArrayList<Proteine>();
        for (Proteine p: mapDeProts.values()) {
            AcideAmine.lireAcideAmines(p.sequenceAcide);
            Map<AcideAmine.AcideAmines, Integer> mapAcide = new HashMap<>();
            mapAcide =  AcideAmine.lireAcideAmines(p.sequenceAcide);

            for (int i = 0; i < mapAcide.size(); i++) {

                if (mapAcide.hashCode()<=mapUti.hashCode()){
                    listAcide.add(p);
                }
            }
            return listAcide;
        }
        return listAcide;
    }

    @Override
    public String toString() {
        return "Proteome{" +
                "map=" + mapDeProts +
                '}';
    }
}
