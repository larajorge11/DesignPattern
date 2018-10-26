package openclosed;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilterImproved implements Filter<Product> {

    /*
    Open-Closed: It's open because it's Ok for you to go ahead and inherit things
    or implement interfaces but it's closed for modification
     */
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
