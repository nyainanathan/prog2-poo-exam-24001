import java.time.LocalDateTime;
import java.util.List;

public class MatchOfficiel extends Match {

    public MatchOfficiel(String id, LocalDateTime date, String endroit, List<Combattant> combattants, boolean egalite, Combattant gagnant) {
        super(id, date, endroit, combattants,  egalite, gagnant);
    }

    @Override
    public void terminer() {

    }
}
