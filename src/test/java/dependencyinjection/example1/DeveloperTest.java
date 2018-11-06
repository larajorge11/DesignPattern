package dependencyinjection.example1;

import dependencyinjection.example1.BackendDeveloper;
import dependencyinjection.example1.Developer;
import dependencyinjection.example1.FrontendDeveloper;
import org.junit.Test;

public class DeveloperTest {

    @Test
    public void testDeveloper() {
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

        Developer developer = new Developer(backendDeveloper, frontendDeveloper);
        developer.implement();
    }
}
