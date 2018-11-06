package dependencyinjection.example1;

public class FrontendDeveloperNew implements IDeveloper {

    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
        System.out.println("frontend develops Java");
    }

}
