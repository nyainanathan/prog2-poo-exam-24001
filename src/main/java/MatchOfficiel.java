import java.time.LocalDateTime;
import java.util.List;

public class MatchOfficiel extends Match {

    public MatchOfficiel(String id, LocalDateTime date, String endroit, List<Combattant> combattants) {
        super(id, date, endroit, combattants);
    }

    @Override
    public void terminer() {

    }
}
