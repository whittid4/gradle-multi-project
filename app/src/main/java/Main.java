import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public String sayHello(String name) {
        LOGGER.info("Saying hello to: %s", name);
        Concatenator concatenator = new Concatenator();
        return concatenator.concatenate("Hello", name);
    }
}
