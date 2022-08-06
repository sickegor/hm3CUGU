package first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class First {
    @Test
    void firstTest(){
        assertTrue(3>1); /// надо

    }

    @Test
    void firstTest2(){
        assertTrue(3>=2);
        assertTrue(3>-2);
    }
}

