package pl.katarzynaskowronska.learning.polymorphismZadanie;

public class BirdTest {
    public static void main(String[] args) {

        BoxBird<Parrot, Chicken> box = new BoxBird();
        box.setK(new Chicken());
        box.setT(new Parrot());

    }
}
