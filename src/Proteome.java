import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class Proteome {

    HashMap<String, Proteines> map = new HashMap<>();

    public void ajouterProteine(Proteines proteines){
        map.put(proteines.getNomCourt(), proteines);
    }

    Proteines rechercherNomCourtExact(String nomCourt){
        return map.get(nomCourt);
    }

    @Override
    public String toString() {
        return "Proteome{" +
                "map=" + map +
                '}';
    }
}
