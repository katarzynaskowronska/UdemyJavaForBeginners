package pl.katarzynaskowronska.learning.classandobject;

public class Test {
    public static void main(String[] args) {
//        int x =1;
//        String s = " ";
//
//        Client client1 = new Client();
//        client1.name = "Kasia";
//        System.out.println(client1.name);
//        s = Client.COMPANY_NAME;
//
//        Client client2 = null;
//
//        System.out.println(client2);
//        System.out.println(client1);
//
//        if(client2!=null){
//            System.out.println(client2);
//        }

        Client clientKasia = new Client();
        clientKasia.setFirstName("Kasia");
        clientKasia.setLastName("Forbes");

        Address kasiaAddress = new Address("Warsaw", "00-001");
//        kasiaAddress.setPostCode("00-001");
//        kasiaAddress.setPostOffice("Warsaw");

        clientKasia.setAddress(kasiaAddress);

        System.out.println(clientKasia.getLastName());
        System.out.println(Client.COMPANY_NAME);
        clientKasia.introduceYourself();

        Invoice invoice = new Invoice(clientKasia, 1, "18-08-18", 89);
        System.out.println(invoice.calculateTax());
    }
}
