import lombok.*;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@ToString
@AllArgsConstructor

public abstract class Match {
    private String id;
    private LocalDateTime date;
    private String endroit;
    private List<Combattant> combattants;
    private boolean egalite;
    private Combattant gagnant;

    public abstract void terminer();
}
