package pl.katarzynaskowronska.learning.encapsulationZadanie;

public class Prime {

    public static void main(String[] args) {

     //   listOfPrime(1,5);

    }

    String listOfPrime(int x, int y) {
        for (int i = x; i <= y; i++) {
           checkPrime(i);
        }
        return "";
    }

    private boolean checkPrime ( int n){
        boolean isPrime = true;
        int counter = n - 1;
        for (; counter > 1; counter--) {
            if (n % counter == 0) {
                isPrime = false;
                System.out.println(n + "false");
                break;
            }
        }
        System.out.println(n + "true");
        return isPrime;
    }
}
