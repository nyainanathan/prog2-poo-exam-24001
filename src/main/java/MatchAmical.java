import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


public class MatchAmical extends Match {

    public MatchAmical(String id, LocalDateTime date, String endroit, List<Combattant> combattants, boolean egalite, Combattant gagnant) {
        super(id, date, endroit, combattants,  egalite, gagnant);
    }

    @Override
    public void terminer() {
        System.out.println("Le match amical se termine ...");
    }
}
