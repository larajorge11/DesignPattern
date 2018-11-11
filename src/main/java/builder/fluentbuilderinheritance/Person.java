package builder.fluentbuilderinheritance;

public class Person {

    public String name;

    public String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

class PersonBuilder<T extends PersonBuilder<T>> {
    protected Person person = new Person();

    public T withName(String name) {
        person.name = name;
        return buildSelf();
    }

    public Person build() {
        return person;
    }

    protected T buildSelf() {
        return (T)this;
    }
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAt(String position) {
        person.position = position;
        return buildSelf();
    }

    @Override
    protected EmployeeBuilder buildSelf() {
        return this;
    }
}
