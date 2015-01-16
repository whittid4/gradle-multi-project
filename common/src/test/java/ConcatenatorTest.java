public class ConcatenatorTest {

    public void testConcatenate() {
        Concatenator concatenator = new Concatenator();

        String actual = concatenator.concatenate("Hello", "Dave");

        assert actual.equals("Hello Dave");
    }
}
