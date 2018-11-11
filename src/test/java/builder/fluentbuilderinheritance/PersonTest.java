package builder.fluentbuilderinheritance;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonJustName() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.withName("Jorge").build();
    }

    @Test
    public void testPersonNameAndPosition() {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person jorge = employeeBuilder
                .withName("Jorge")
                .worksAt("Java Developer")
                .build();
        System.out.println(jorge);
    }
}
