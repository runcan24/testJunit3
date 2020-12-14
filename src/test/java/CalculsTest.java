import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculsTest {

    private Calculs calculs = null;

    @BeforeEach
    public void setUp(){
        calculs = new Calculs(2,4);
    }

    @Test
    public void testerMultipliser(){
        int valMult = calculs.multiplier();

        assertEquals(valMult, 8);
    }

    @Test
    public void testerAdditionner(){
        int valAdd = calculs.additionner();

        assertEquals(valAdd, 6);
    }
}