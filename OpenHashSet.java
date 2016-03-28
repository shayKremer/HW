/**
 * Created by Elad on 25-Mar-16.
 */
public class OpenHashSet extends SimpleHashSet {


    public static int INITIAL_CAPACITY = 16;
    private static double UPPER_LOAD_FACTOR = 0.75;
    private static double LOWER_LOAD_FACTOR = 0.25;

    /* ===================== Constructors =============================*/
    /**
     * A default constructor. Constructs a new, empty table with default
     * initial capacity (16), upper load factor (0.75) and lower load factor (0.25).
     */
    public OpenHashSet(){
//        int initialCapacity = INITIAL_CAPACITY;
//        double upperLoadFactor = UPPER_LOAD_FACTOR;
//        double lowerLoadFactor = LOWER_LOAD_FACTOR;
    }

    /**
     * Constructs a new, empty table with the specified load factors,
     * and the default initial capacity (16).
     * @param upperLoadFactor The upper load factor of the hash table.
     * @param lowerLoadFactor The lower load factor of the hash table.
     */
    public OpenHashSet(float upperLoadFactor,
                       float lowerLoadFactor){}

    /**
     * Data constructor - builds the hash set by adding the elements one by one.
     * Duplicate values should be ignored. The new table has the default values
     * of initial capacity (16), upper load factor (0.75), and lower load factor
     * (0.25).
     * @param data Values to add to the set.
     */
    public OpenHashSet(java.lang.String[] data){}

     /* ======================= Methods ================================*/

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

    /**
     * @return The current capacity (number of cells) of the table.
     * @implSpec capacity in class SimpleHashSet
     */
    public int capacity(){return 0;}
}

