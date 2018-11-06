package dependencyinjection.example2;

import java.util.List;

public class Research {

    public Research(Relationships relationships) {
        // High level
        List<Triplet<Person, Relationship, Person>> relations =
                relationships.getRelations();

    }
}
