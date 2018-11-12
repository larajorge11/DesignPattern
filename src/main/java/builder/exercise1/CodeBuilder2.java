package builder.exercise1;

import java.util.ArrayList;
import java.util.List;

class Field {

    public String type, name;

    public Field(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("public %s %s;", type, name);
    }
}

class Class {
    public String name;
    public List<Field> fields = new ArrayList<>();

    public Class(){}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String nl = System.lineSeparator();
        sb.append("public class " +  name).append(nl)
                .append("{").append(nl);

        for(Field field : fields) {
            sb.append("  " + field).append(nl);
        }
        sb.append("}").append(nl);
        return sb.toString();
    }
}

public class CodeBuilder2 {
    private Class theClass = new Class();

    public CodeBuilder2(String rootName) {
        theClass.name = rootName;
    }

    public CodeBuilder2 addField (String name, String type) {
        theClass.fields.add(new Field(type, name));
        return this;
    }

    @Override
    public String toString() {
        return theClass.toString();
    }
}
