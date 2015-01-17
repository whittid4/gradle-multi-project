import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatenatorTest {

    @Test
    public void testConcatenate() {
        Concatenator concatenator = new Concatenator();

        String actual = concatenator.concatenate("Hello", "Dave");

        assertEquals(actual, "Hello Dave");
    }
}
