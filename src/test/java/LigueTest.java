import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LigueTest {
    List< String> titres1 = new ArrayList<>();


    List< String> titres2 = new ArrayList<>();

    List<Match> matches = new ArrayList<>();
    Combattant combattant1 = new Combattant("1", "nom1" , "prenom1", "nomCombattant1", 67.2, titres1, 3, 1, 3, 12);
    Combattant combattant2 = new Combattant("2", "nom2" , "prenom2", "nomCombattant2", 67.3, titres2, 3, 0, 4, 13);
    Combattant combattant3 = new Combattant("3", "nom3" , "prenom3", "nomCombattant3", 67.4, titres1, 0, 6, 1, 1);
    Combattant combattant4 = new Combattant("4", "nom4" , "prenom4", "nomCombattant4", 67.9, null, 0, 0, 0, 0);

    Ligue ligue1 = new Ligue("Ligue 1", List.of(combattant1, combattant2, combattant3, combattant4), matches);
    @BeforeEach
    public void setUp() {
        titres1.add("Titre1 1");
        titres1.add("Titre1 2");
        titres1.add("Titre1 3");
        titres1.add("Titre1 4");

        titres2.add("Titre2 1");
        titres2.add("Titre2 2");
        titres2.add("Titre2 3");
        titres2.add("Titre2 4");



        MatchAmical match1 = new MatchAmical("1", LocalDateTime.now(), "Mahamsina", List.of(combattant1, combattant2), false, combattant1 );
        match1.terminer();

        MatchOfficiel match2 = new MatchOfficiel("2", LocalDateTime.now(), "Mahitsy", List.of(combattant1, combattant3), false, combattant3);
        match2.terminer();

        MatchPourUnTitre match3 = new MatchPourUnTitre("3", LocalDateTime.now(), "Ivandry ... oui Ivandry", List.of(combattant2, combattant3), false, combattant2, "Le nouveau titre");
        match3.terminer();

        MatchAmical match4 = new MatchAmical("4", LocalDateTime.now(), "Ivato", List.of(combattant1, combattant3), false, null);
        match4.terminer();

        matches.add(match1);
        matches.add(match2);
        matches.add(match3);
        matches.add(match4);

    }

    @Test
    public void match_amical_affecting_stats_ko(){
        assertEquals(3, combattant1.getVictoires());
        assertEquals(0, combattant2.getDefaits());
    }

    @Test
    public void match_officiel_affecting_stats_ok(){
        assertEquals(1, combattant3.getVictoires());
        assertEquals(2, combattant1.getDefaits());
        assertEquals(4, combattant3.getPoints());
    }

    @Test
    public void match_pour_titre_giving_the_actual_title_ok(){
        assertTrue(combattant2.getTitres().contains("Le nouveau titre"));
        assertFalse(combattant1.getTitres().contains("Le nouveau titre"));
    }

    @Test
    public void get_every_matches_of_figther_ok(){
        assertEquals(3, ligue1.getMatchDeCombattant(combattant1).size());
        assertFalse(ligue1.getMatchDeCombattant(combattant2).size() == 4);
        assertEquals(0, ligue1.getMatchDeCombattant(combattant4).size());
        assertTrue(ligue1.getMatchDeCombattant(combattant3).contains(ligue1.getMatches().get(1)));
    }


}
