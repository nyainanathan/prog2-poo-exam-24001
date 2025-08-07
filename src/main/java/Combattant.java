import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@Setter

public class Combattant {
    private final String id;
    private final String nom;
    private final String prenom;
    private final String nomDeCombattant;
    private final double poids;
    private List<String> titres;
    private int victoires;
    private int defaits;
    private int egalites;
    private int points;

    @Override
    public boolean equals(Object obj) {
        Combattant combattant = (Combattant) obj;
        return this.id == combattant.getId();
    }

    public void addTitle(String title) {
        this.titres.add(title);
    }
}
