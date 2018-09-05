package pl.katarzynaskowronska.learning.interfacesZadanie;

public class PhoneY implements Phone {

    @Override
    public String whatNoise() {
        return "Selected noise: B";
    }

    @Override
    public String message() {
        return "Read new message";
    }

    @Override
    public String phoneNumber() {
        return "303";
    }
}
