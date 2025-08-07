import java.util.List;
import lombok.*;

@Getter
@AllArgsConstructor

public class Ligue {
    private String nom;
    private List<Combattant> combattants;
    private List<Match> matches;
}
