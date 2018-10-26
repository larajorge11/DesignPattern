package openclosed;

public interface Specification<T> {
    /*
    The idea for Specification is for checking whether a particular item
    satisfy some criteria.
     */
    boolean isSatisfied(T item);
}
