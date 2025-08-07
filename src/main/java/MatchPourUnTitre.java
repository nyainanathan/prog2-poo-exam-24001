import java.time.LocalDateTime;
import java.util.List;

public class MatchPourUnTitre extends Match {

    public MatchPourUnTitre(String id, LocalDateTime date, String endroit, List<Combattant> combattants) {
        super(id, date, endroit, combattants);
    }

    @Override
    public void terminer() {

    }
}
