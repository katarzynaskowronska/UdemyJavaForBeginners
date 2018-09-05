package pl.katarzynaskowronska.learning.inheritanceZadanie;

public class ActivityTest {
    public static void main(String[] args) {

        ActivityMovie activityMovie = new ActivityMovie();
        ActivityPhone activityPhone = new ActivityPhone();

        System.out.println(activityMovie.onStop(1));
        System.out.println(activityPhone.onPause(0));

    }
}
