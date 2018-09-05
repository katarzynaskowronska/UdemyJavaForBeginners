package pl.katarzynaskowronska.learning.loops;

import java.util.Spliterator;
import java.util.logging.SocketHandler;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) { //for (int i = 1; i <= 30; i++)
            System.out.println("nr# " + i);
        }

//        for (;;){
//            System.out.println("p"); //Crtl + F2 zatrzymanie programu
//            // exit code 1 = program zatrzymany z zewnątrz
//        }

        int l = 20;
        for (; l > 10; l--) {
            System.out.println(l);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - ");
            for (int j = 0; j < 10; j++) {
                System.out.print(j + ",");
            }
            System.out.println("");
        }

        int[] ints = {4, 3, 65, 123, 2, 90, 15};

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        ////////////// foreach

        for (int i : ints) {
            System.out.println(i);
        }

        //////////////// while

        //  while(true){
        //      System.out.println(true);
        //  }
        int z = 200;
       /* while(z>-100){
            z--;
            System.out.println(z);
        }
        */
        while (z % 3 != 0) {
            z--;
            System.out.println(z);
        }

        ////////// do while

        do {
            System.out.println(false);
        }
        while (false);

        /////////// LABELS
        LABEL: //QWERTY:
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i);
            for (int j = 0; j < 100; j++) {
                System.out.println("j= " + j);
                //break LABEL;
                continue LABEL; //continue; // QWERTY;
            }

        }
// Zadanie: wypisz zawartość 5 elementowej tablicy oraz wynik dodawania jej elementów.
        // Wszystkie elementy tablicy maja znajdowac sie w jednym rzedzie,
        // ponizej ma znajdowac sie suma dodawania. Nalezy wykorzystac petle

        Integer[] inty = new Integer[]{0, 1, 2, 3, 4};

        for(int i= 0; i<inty.length; i++){
            System.out.print(inty[i] + ", ");
        }
        System.out.println("");
        //for (int i : inty) {
        //    System.out.println(i);
        //}
        /*int suma = 0;
        for (int i = 0; i<inty.length; i++){
            suma += inty[i];
        }
        System.out.println("Suma: " + suma);
        */

        int m = 0;
        int wynik = 0;
        do {
        wynik += inty[m++];
        }
        while(m<inty.length);
        System.out.println("Wynik: " + wynik);

        //alternatywa prowadzacego
        int[] intsy = {23, 43, 71,11, 32};
        int result = 0;
        for (int i : intsy){
            result +=i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(result);







    }
}

