package SingletonPattern;

/**
 * Created by peter on 04/05/16.
 */
public enum DBHelper {
    INSTANCE;

    int value = 0;

    public void setValue(int val){
        value = val;
    }

    public void speak() {
        System.out.println("value: " + value);
    }
}
