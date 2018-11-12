package builder.exercise1;

import java.util.ArrayList;

class CodeBuilder {
    private String className;
    private CodeElement root = new CodeElement();

    public CodeBuilder(String className) {
        this.className = className;
        root.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        CodeElement codeElement = new CodeElement(name, type);
        root.elements.add(codeElement);
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}

class CodeElement {
    public String className;
    public String name, type;
    public ArrayList<CodeElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public CodeElement() {
    }

    public CodeElement(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String toStringImpl(int indent) {
        int cc = 0;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();

        if ((name != null && type != null) && (!name.isEmpty() && !type.isEmpty())) {
            sb.append("  ")
                    .append(String.format("public %s %s;%s", type, name, newLine));
            flag = true;

        } else {
            sb.append(String.format("public class %s%s{%s", className, newLine, newLine));
        }

        for (CodeElement element : elements) {
            sb.append(element.toStringImpl(indent + 1));
            cc++;
        }

        if ((elements.size() > 0 && (elements.size() == cc)) || (cc == 0 && !flag)) {
            sb.append("}").append(newLine);
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}
