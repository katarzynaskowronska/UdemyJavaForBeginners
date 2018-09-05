package pl.katarzynaskowronska.learning.interfacesZadanie;

public class PhoneTest {
    public static void main(String[] args) {
        PhoneX phoneX = new PhoneX();
        PhoneY phoneY = new PhoneY();

        System.out.println(phoneX.message());
        System.out.println(phoneY.whatNoise());

        phoneX.phoneNumber();


    }
}
