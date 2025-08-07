import java.time.LocalDateTime;
import java.util.List;

public class MatchPourUnTitre extends Match {


    public MatchPourUnTitre(String id, LocalDateTime date, String endroit, List<Combattant> combattants, boolean egalite, Combattant gagnant) {
        super(id, date, endroit, combattants,  egalite, gagnant);
    }

    @Override
    public void terminer() {

    }
}
