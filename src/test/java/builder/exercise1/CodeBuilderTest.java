package builder.exercise1;

import org.junit.Ignore;
import org.junit.Test;

public class CodeBuilderTest {

    @Test
    public void buildCodeTest() {
        CodeBuilder codeBuilder = new CodeBuilder("Person");
        codeBuilder
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(codeBuilder);
    }

    @Test
    @Ignore
    public void buildEmptyTest() {
        CodeBuilder codeBuilder = new CodeBuilder("Foo");
        System.out.println(codeBuilder);
    }

    @Test
    public void buildCodeTest2() {
        CodeBuilder2 codeBuilder = new CodeBuilder2("Person");
        codeBuilder
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(codeBuilder);
    }
}
