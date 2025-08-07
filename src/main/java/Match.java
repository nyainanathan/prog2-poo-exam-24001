import lombok.*;

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

    public abstract void terminer();
}
