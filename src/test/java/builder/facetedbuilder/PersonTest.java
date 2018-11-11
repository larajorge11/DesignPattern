package builder.facetedbuilder;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testFacetedBuilderPerson(){
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
                .lives()
                    .at("Calle 26 Cra 69")
                    .in("Bogota")
                    .withPostCode("110111")
                .works()
                    .at("Globant")
                    .asA("Java Developer")
                    .earning(1234)
                .build();
        System.out.println(person);
    }
}
