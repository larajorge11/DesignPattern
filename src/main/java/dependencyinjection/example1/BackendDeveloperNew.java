package dependencyinjection.example1;

public class BackendDeveloperNew implements IDeveloper {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
        System.out.println("backend develops Java");
    }

}
