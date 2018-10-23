package singleresponsability;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    // This method should be in another class for its responsability
    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }

    // This is a violation for SRP because it has taken a new approach
    // of the journal class, this new entries are considered as
    // persistance which it is a separate concern
    public void load(String filename){}
    public void load(URL url){}

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
