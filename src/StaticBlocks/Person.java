package StaticBlocks;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by peter on 04/05/16.
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate){
        this.birthDate = birthDate;
    }

    private static final Date BOOMSTART;
    private static final Date BOOMEND;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOMSTART = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOMEND = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOMSTART) >= 0 &&
                birthDate.compareTo(BOOMEND) < 0;
    }
}
