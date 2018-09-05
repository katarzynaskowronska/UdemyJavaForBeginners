package pl.katarzynaskowronska.learning.encapsulation;

public class Enc {

    private static int x;   //dostepna tylko w zakresie danej klasy
    int z; // dostepna w tej samej klasie oraz pakiecie - ma modyfikator domyslny
    protected int y; // dostepna w klasie, pakiecie i podklasie za pomoca slowka this.
    //publik - dostepna w klasie pakiecie, podpakiecie, wszedzie
    public static void main(String[] args) {

    }

    private int getInside(){
        InsideEnc insideEnc = new InsideEnc();
        return  insideEnc.insideZ;
    }


    class InsideEnc{
        private int insideZ = 0;
    }
}
