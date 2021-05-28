import java.util.Objects;

public class Proteine implements Comparable<Proteine> {

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
    public int compareTo(Proteine proteine){
        int comparason = nomCourt.compareTo(proteine.nomCourt);
        return comparason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proteine proteine = (Proteine) o;
        return Objects.equals(nomCourt, proteine.nomCourt);
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
