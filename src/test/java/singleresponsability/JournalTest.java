package singleresponsability;

import org.junit.Test;

public class JournalTest {

    @Test
    public void testAddEntries() {
        Journal journal = new Journal();
        journal.addEntry("Today I learned a new Design Pattern");
        journal.addEntry("I learned SRP");
        System.out.println(journal);
    }
}
