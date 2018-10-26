package openclosed;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ProductFilterImprovedTest {

    private List<Product> products;

    @Before
    public void setUp() {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product cellphone = new Product("Cellphone", Color.WHITE, Size.SMALL);
        Product bicycle = new Product("Bicycle", Color.BLACK, Size.MEDIUM);
        Product house = new Product("House", Color.WHITE, Size.LARGE);

        products = ImmutableList.of(apple, house, cellphone, bicycle);

    }

    @Test
    public void filterByColor() {
        ProductFilterImproved filterImproved = new ProductFilterImproved();
        filterImproved.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.getName()));
    }

    @Test
    public void filterByColorSize() {
        ProductFilterImproved filterImproved = new ProductFilterImproved();
        Stream<Product> result = filterImproved.filter(products, new CombinatorSpecification<>(
                new ColorSpecification(Color.WHITE),
                new SizeSpecification(Size.MEDIUM)
        ));

        assertNotNull(result);
        assertThat(result.count(), is(0L));
    }
}
