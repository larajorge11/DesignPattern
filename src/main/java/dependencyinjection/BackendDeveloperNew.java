package dependencyinjection;

public class BackendDeveloperNew implements IDeveloper {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
        System.out.println("backend develops Java");
    }

}
