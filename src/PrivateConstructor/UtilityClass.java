package PrivateConstructor;

/**
 * Created by peter on 04/05/16.
 */
public class UtilityClass {
    // suppress default constructor for noninstantiability
    private UtilityClass(){
        throw new AssertionError();
    }
}
