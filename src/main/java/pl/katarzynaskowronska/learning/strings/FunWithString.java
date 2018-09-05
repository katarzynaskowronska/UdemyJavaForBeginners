package pl.katarzynaskowronska.learning.strings;


import pl.katarzyna.udemy.classandobject.Invoice;
import pl.katarzyna.udemy.utils.StrUtils;

public class FunWithString {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(null, 0, null, 0);
        invoice.toString();

        System.out.println(invoice.toString());
        System.out.println(invoice);

        String text1 = "a" + "b";
        String text = "a".concat("b");

        System.out.println(text1);
        System.out.println(text);

        if(text == text1){
            System.out.println("equals");
        }
        if(text.equals(text1)){
            System.out.println("equals1");
        }
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String s = "a,b,c,d,e";
        String[] strings = s.split(",");
        System.out.println(strings[2]);

        String result = " ";
        for(String str : strings) {
            result = result + str + ", ";
        }
        System.out.println(StrUtils.removeLastSeparator(result, ","));

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<10000; i++){
            sb.append("a");
        }
        System.out.println(sb.toString());

        String res = "";
        for(int i =0; i<10; i++){
            res+= "a";
        }
        System.out.println(res);


        ///decode // encode


    }
}
