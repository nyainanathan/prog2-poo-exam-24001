import java.time.LocalDateTime;
import java.util.List;

public class MatchPourUnTitre extends Match {

    private String titreAGagner;

    public MatchPourUnTitre(String id, LocalDateTime date, String endroit, List<Combattant> combattants, boolean egalite, Combattant gagnant, String titreAGagner) {
        super(id, date, endroit, combattants,  egalite, gagnant);
        this.titreAGagner = titreAGagner;
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
                    combattant.addTitle(titreAGagner);
                } else {
                    combattant.setDefaits(combattant.getDefaits() + 1);
                }
            });
        }
    }
}
