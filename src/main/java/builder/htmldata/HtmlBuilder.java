package builder.htmldata;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder (String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    public void addChild(String childName, String childtext) {
        HtmlElement e = new HtmlElement(childName, childtext);
        root.elements.add(e);
    }

    public HtmlBuilder addChildFluentInterface(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.elements.add(e);
        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
