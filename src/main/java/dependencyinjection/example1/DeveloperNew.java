package dependencyinjection.example1;

import java.util.List;

public class DeveloperNew {

    List<IDeveloper> developers;

    public DeveloperNew(List<IDeveloper> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(d -> d.develop());
    }
}
