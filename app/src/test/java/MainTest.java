public class MainTest {

    //@Test
    public void testSayHello() {
        Main main = new Main();

        String actual = main.sayHello("Dave");

        assert actual.equals("Hello Dave");
    }
}
