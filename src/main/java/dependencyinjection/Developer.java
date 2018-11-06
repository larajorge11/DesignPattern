package dependencyinjection;

// High Level Module
public class Developer {

    /*
    1) High Level modules shouldn't depend on low-level modules, both
    should depend on abstractions

    2) Abstractions shouldn't depend on details, details should depend
    on abstractions
     */


    // Low level Modules
    private BackendDeveloper backendDeveloper;
    private FrontendDeveloper frontendDeveloper;

    public Developer(BackendDeveloper backendDeveloper, FrontendDeveloper frontendDeveloper) {
        this.backendDeveloper = backendDeveloper;
        this.frontendDeveloper = frontendDeveloper;
    }

    public void implement() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavascript();
    }
}
