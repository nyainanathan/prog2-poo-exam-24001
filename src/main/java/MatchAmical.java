import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


public class MatchAmical extends Match {

    public MatchAmical(String id, LocalDateTime date, String endroit, List<Combattant> combattants) {
        super(id, date, endroit, combattants);
    }

    @Override
    public void terminer() {

    }
}
