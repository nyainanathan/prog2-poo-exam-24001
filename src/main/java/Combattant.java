import java.util.List;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomDeCombattant;
    private double poids;
    private List<String> titres;
}
