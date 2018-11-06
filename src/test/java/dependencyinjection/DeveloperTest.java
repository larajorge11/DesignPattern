package dependencyinjection;

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
