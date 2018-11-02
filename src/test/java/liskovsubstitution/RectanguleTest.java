package liskovsubstitution;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectanguleTest {

    @Test
    public void testSquare() {
        Rectangule r = new Square();
        r.setHeight(5);
        r.setWidth(6);

        assertThat(r.calculateArea(), is(30));
    }
}
