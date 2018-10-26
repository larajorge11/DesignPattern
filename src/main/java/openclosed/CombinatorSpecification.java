package openclosed;

public class CombinatorSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public CombinatorSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
