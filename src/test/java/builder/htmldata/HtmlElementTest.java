package builder.htmldata;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class HtmlElementTest {

    @Test
    public void testHtmlBuilder() {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        assertNotNull(builder);
        System.out.println(builder);
    }

    @Test
    public void testHtmlBuilderFluentInterface() {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
                .addChildFluentInterface("li", "hello")
                .addChildFluentInterface("li", "world");
        assertNotNull(builder);
        System.out.println(builder);
    }
}
