import BuilderPattern.NutritionFacts;
import SingletonPattern.DBHelper;

public class Main {

    public static void main(String[] args) {

        /* Builder Example */
        NutritionFacts cocacola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(25)
                .carbohydrate(27)
                .build();


        /* Singleton Example */
        DBHelper helper1 = DBHelper.INSTANCE;
        helper1.setValue(5);

        DBHelper helper2 = DBHelper.INSTANCE;
        helper2.setValue(7);

        DBHelper.INSTANCE.speak();
        helper1.speak();
        helper2.speak();
    }
}
