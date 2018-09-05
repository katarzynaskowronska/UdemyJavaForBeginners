package pl.katarzynaskowronska.learning.inheritance;

public class FactoryTest {
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        PhoneFactory phoneFactory = new PhoneFactory();

        carFactory.produce();
        phoneFactory.produce();

        carFactory.testDrive();
        phoneFactory.testCall();

//        Factory factory = new Factory() {
//            @Override
//            public void produce() {
//                super.produce();
//            }
//
//            @Override
//            public void checkState() {
//                super.checkState();
//            }
//        };
        carFactory.checkState();
        phoneFactory.checkState();

        System.out.println(phoneFactory.introduceYourself());

        CarFactory car1 = new CarFactory();
        CarFactory car2 = new CarFactory();
        car1.setName("C");
        car2.setName("C");
        System.out.println(car1.equals(car2));
    }

}
