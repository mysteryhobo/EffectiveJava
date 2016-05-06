package EnumExample;

/**
 * Created by peter on 05/05/16.
 */

public class Band {
    private enum Members {JERRY, BOBBY, PHIL};
    private static Members selectedBandMember;

    public static void main(String[] args) {
        if (selectedBandMember == Members.JERRY) {
            //do JERRY stuff here
        }
    }
}
