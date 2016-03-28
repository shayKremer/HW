import java.util.Collection;
import java.util.LinkedList;

/**
 * Wraps an underlying Collection and serves to both simplify its API and give
 * it a common type with the implemented SimpleHashSets.
 */

public class CollectionFacadeSet implements SimpleSet {

    protected java.util.Collection<java.lang.String> collection;

    /**
     * Creates a new facade wrapping the specified collection.
     *
     * @param collection - The Collection to wrap
     */
    public CollectionFacadeSet(java.util.Collection<java.lang.String> collection) {
        
    }

    @Override
    public boolean add(String newValue) {
        return false;
    }

    @Override
    public boolean contains(String searchVal) {
        return false;
    }

    @Override
    public boolean delete(String toDelete) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }


}
