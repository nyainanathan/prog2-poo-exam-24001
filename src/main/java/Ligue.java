import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter
@AllArgsConstructor

public class Ligue {
    private String nom;
    private List<Combattant> combattants;
    private List<Match> matches;

    public List<Match> getMatchDeCombattant(Combattant combattant){
        List<Match> matches = this.getMatches();
        return matches.stream()
                .filter(match -> match.getCombattants().contains(combattant))
                .toList();
    }

}
