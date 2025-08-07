import java.time.LocalDateTime;
import java.util.List;

public class MatchOfficiel extends Match {

    public MatchOfficiel(String id, LocalDateTime date, String endroit, List<Combattant> combattants, boolean egalite, Combattant gagnant) {
        super(id, date, endroit, combattants,  egalite, gagnant);
    }

    @Override
    public String toString() {
        return "Le match officiel se termine: " + getGagnant().getNomDeCombattant() + " l'emporte et emmene avec lui les 3 points";
    }

    @Override
    public void terminer() {
        if(this.isEgalite()){
            getCombattants().forEach((combattant)->{
                combattant.setPoints(combattant.getPoints() + 1);
                combattant.setEgalites(combattant.getEgalites() + 1);
            });
        } else {
            getCombattants().forEach((combattant)->{
                if(combattant.equals(getGagnant())){
                    combattant.setPoints(combattant.getPoints() + 3);
                    combattant.setVictoires(combattant.getVictoires() + 1);
                } else {
                    combattant.setDefaits(combattant.getDefaits() + 1);
                }
            });
        }
        System.out.println(this.toString());
    }
}
