package pl.katarzynaskowronska.learning.encapsulation;

public interface EncI {

    void hi();


    EncI encI = new EncI() { //anonimowa klasa wewnetrzna
        @Override
        public void hi() {
            System.out.println("hi");
        }
    };
}
