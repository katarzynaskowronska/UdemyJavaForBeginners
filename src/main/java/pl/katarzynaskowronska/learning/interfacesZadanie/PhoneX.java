package pl.katarzynaskowronska.learning.interfacesZadanie;

public class PhoneX implements Phone{

    @Override
    public String whatNoise() {
        return "Selected noise: A";
    }

    @Override
    public String message() {
        return "You have a message";
    }

    @Override
    public String phoneNumber() {
        return "505";
    }
}
