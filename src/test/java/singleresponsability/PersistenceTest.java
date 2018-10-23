package singleresponsability;

import org.junit.Test;

import java.io.FileNotFoundException;

public class PersistenceTest {

    @Test
    public void testPersistence() throws FileNotFoundException {
        Persistence persistence = new Persistence();
        Journal journal = new Journal();
        journal.addEntry("Today I learned a new Design Pattern");
        journal.addEntry("I learned SRP");

        persistence.saveToFile(journal,
                "/home/lara/Documents/Tutorials/test.txt",
                true);
    }
}
