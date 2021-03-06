package openclosed;

enum Color {
    GREEN, YELLOW, BLACK, WHITE
}

enum Size {
    SMALL, MEDIUM, LARGE
}

public class Product {
    private String name;
    public Color color;
    public Size size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
