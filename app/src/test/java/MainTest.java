import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSayHello() {
        Main main = new Main();

        String actual = main.sayHello("Dave");

        assertEquals(actual, "Hello Dave");
    }
}
