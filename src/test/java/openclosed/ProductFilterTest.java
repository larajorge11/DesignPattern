package openclosed;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Stream;


public class ProductFilterTest {

    private List<Product> products;
    private ProductFilter productFilter;

    @Before
    public void setUp() {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product cellphone = new Product("Cellphone", Color.WHITE, Size.SMALL);
        Product bicycle = new Product("Bicycle", Color.BLACK, Size.MEDIUM);
        Product house = new Product("House", Color.WHITE, Size.LARGE);

        products = ImmutableList.of(apple, house, cellphone, bicycle);

        productFilter = new ProductFilter();
    }

    @Test
    public void testFilterByColorSize() {
        Stream<Product> result =
                productFilter.filterByColorSize(products, Color.GREEN, Size.SMALL);

        assertNotNull(result);
        assertThat(result.count(), is(1L));

    }

    @Test
    public void testFilterByColor() {
        Stream<Product> result = productFilter.filterByColor(products, Color.WHITE);

        assertNotNull(result);
        assertThat(result.count(), is(2L));
    }

    @Test
    public void testFilterBySize() {
        Stream<Product> result = productFilter.filterBySize(products, Size.SMALL);

        assertNotNull(result);
        assertThat(result.count(), is(2L));
    }
}
