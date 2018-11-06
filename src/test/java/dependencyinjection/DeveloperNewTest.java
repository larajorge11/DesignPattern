package dependencyinjection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DeveloperNewTest {

    private BackendDeveloperNew backendDeveloperNew;
    private FrontendDeveloperNew frontendDeveloperNew;

    @Before
    public void setUp() {
        backendDeveloperNew = new BackendDeveloperNew();
        frontendDeveloperNew = new FrontendDeveloperNew();
    }

    @Test
    public void testDeveloperNewBothDevelopers() {
        List<IDeveloper> developers = new ArrayList<>();
        developers.add(backendDeveloperNew);
        developers.add(frontendDeveloperNew);
        DeveloperNew developerNew = new DeveloperNew(developers);
        developerNew.implement();
    }

    @Test
    public void testDeveloperNewJustBackend() {
        List<IDeveloper> developers = new ArrayList<>();
        developers.add(backendDeveloperNew);
        DeveloperNew developerNew = new DeveloperNew(developers);
        developerNew.implement();
    }

    @Test
    public void testDeveloperNewJustFrontend() {
        List<IDeveloper> developers = new ArrayList<>();
        developers.add(frontendDeveloperNew);
        DeveloperNew developerNew = new DeveloperNew(developers);
        developerNew.implement();
    }
}
