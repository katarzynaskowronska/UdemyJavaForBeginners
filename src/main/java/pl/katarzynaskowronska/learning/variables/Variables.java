package pl.katarzynaskowronska.learning.variables;

public class Variables {
    public static void main(String[] args) {
        int x = 52 + 87;
        byte b = 127;
        byte b1 = -128;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        Integer integer = 2;
        System.out.println(integer);
        int sum = i + 1;
        System.out.println(sum);
        long l = Long.MAX_VALUE;
        System.out.println(l);
        Long l1 = 23l;

        float f = 0.0f;
        float f1 = Float.MAX_VALUE;
        double d = 0.0;
        double d1 = Double.MAX_VALUE;
        System.out.println(f1);
        System.out.println(d1);

        char c = 'a';
        String str = "hello, how are you?";

        boolean boo = true;
        boolean boo2 = false;
        System.out.println(boo);
        System.out.println(str);

        ///////////////

        System.out.println("Sum: " + b + b1);
        System.out.println("Sum: " + (b + b1)); //Crt + Alt + L // Crt + Alt + O

        int z = 1+2;
        int z1 = z+b;
        System.out.println(z1);

        int y = b-b1;
        int xx = y^y;
        int yy = z1/z;
        double dd = z1/z;
        double dz = 3.0;
        double dz1 = 130.0;
        double dzz = dz1/dz;

        int r = z1%z;

        System.out.println(yy);
        System.out.println(dd);
        System.out.println(dzz);
        System.out.println(r);

        //////////////////////
        int w = 10;
        int w1 = 20;
        int w2 = 30;
        System.out.println(w++);
        System.out.println(w);
        System.out.println(w2++);
        System.out.println(++w1);
        System.out.println(--w1);

        z += 5; // x = x + 5;
        z -= 5; // x = x - 5;
        z *= 5; // x = x * 5;
        z /= 5; // x = x / 5;
        z %= 5; // x = x % 5;

        ///////////// constance

        final int T_T = 13;
        int t1;
        t1=8;
        // T_T *= 2;

    }
}
