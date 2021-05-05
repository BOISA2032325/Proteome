import java.util.Objects;

public class Proteines implements Comparable<Proteines> {

    String nomCourt;
    String nomLong;
    String sequenceAcide;


    public String getNomCourt() {
        return nomCourt;
    }


    public void setNomCourt(String nomCourt) {
        this.nomCourt = nomCourt;
    }
    public void setNomLong(String nomLong) {
        this.nomLong = nomLong;
    }

    public String getNomLong() {
        return nomLong;
    }

    public void setSequenceAcide(String sequenceAcide) {
        this.sequenceAcide = sequenceAcide;
    }


    public String getSequenceAcide() {
        return sequenceAcide;
    }


    @Override
    public int compareTo(Proteines proteines){
        int comparason = nomCourt.compareTo(proteines.nomCourt);
        return comparason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proteines proteines = (Proteines) o;
        return Objects.equals(nomCourt, proteines.nomCourt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomCourt);
    }

    public String toString(){

        String resultat;

        resultat = '\n' + " " + '\n' + "nomCourt = " + nomCourt + '\n' +
                "nomLong = " + nomLong + '\n' +  "sequence = "  + sequenceAcide + '\n' + " " + '\n';



        return resultat;
    }


}
