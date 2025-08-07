import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class InitialTest {
    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @Test
    void basicTest(){
        assertTrue(true);
    }

}
