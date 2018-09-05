package pl.katarzynaskowronska.learning.methods;

public class Methods {
    public static void main(String[] args) {
        sayHi();
        sayHi();
        hi();
        hi("Karol");
        hi("Maciek", "Jacek");
        hi("Maciek", "Jacek", "Wojtek");
        System.out.println(addition(4, 3, 2));
        System.out.println(addition(9, (addition(4, 3, 2))));
        System.out.println(checkBy3(4));
        // foo();
        System.out.println(factorial(8));
        checkPrime(5);
        checkPrime(3);
        checkPrime(27);
        checkPrime(37);
        checkPrime(59);
        checkPrime(89);
    }

    private static void sayHi() {
        System.out.println("Hi Kasia");
    }

//    private static void hi(String name){
//        System.out.println("Hi " + name);
//    }
//    private static void hi(String name, String name2){
//        System.out.println("Hi " + name + ", " + name2);
//    }

    private static void hi(String... names) {
        String result = "";
        for (String s : names) {
            result = result + s + ", ";
        }
        System.out.println("Hi " + result);
    }

    private static int addition(int... a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    private static boolean checkBy3(int a) {
        return a % 3 == 0;
//        if (a%3 == 0){
//            return true;
//        }else{
//            return false;
//        }
    }

    private static void foo() {
        System.out.println("foo");
        foo();
    }

    //n! // 5! =5*4*3*2*1

    private static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }


    //Zadanie: napisz metodę, która sprawdzi czy podana liczba jest pierwsza

    private static void prime(int a) {
        if(a <= 3){
            System.out.println("Twoja liczba: " + a + " jest liczbą pierwszą");
        }
//        for(int i = 1; i <=a; i++){
//            double dzielnik = a/i;
//            if(dzielnik == 3){
//                System.out.println("Twoja liczba: " + a + " NIE jest liczbą pierwszą");
//                break;
//            }
//            else {
//                System.out.println("Twoja liczba: " + a + " jest liczbą pierwszą");
//            }
//        }
        else if(a%2 == 0 || a%3 ==0 || a%5 ==0) {
            System.out.println("Twoja liczba: " + a + " NIE jest liczbą pierwszą");
        }
        else {
            System.out.println("Twoja liczba: " + a + " jest liczbą pierwszą");
        }
    }
/////////////Rozwiązanie
    private static boolean checkPrime(int n){
        boolean isPrime = true;
        int counter = n-1;
        for(;counter>1; counter --){
            if(n%counter==0){
                isPrime = false;
                System.out.println(n + "false");
                break;
            }
        }
        System.out.println(n+ "true");
        return isPrime;
    }

//        if(int i =<3){
//            return true;
//        }
//        else
//        for (int i = 4; i = a[i]; i++) {
//
//        }
//        return true;
//        else
//        return false;
//    }
//    for(int i = 1; i< 300;i++)
//
//    {
//
//        int podzielnik = 2;
//        boolean liczbaPierwsza = true;
//        if (i > 3) {
//            while (podzielnik < i) {
//                if (i % podzielnik == 0) {
//                    liczbaPierwsza = false;
//                    break;
//                }
//                podzielnik++;
//            }
//        }
//        if (liczbaPierwsza) {
//            System.out.println("Liczba pierwsza: " + i);
//        }
   }


