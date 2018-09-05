package pl.katarzynaskowronska.learning.encapsulation.inside;

import pl.katarzyna.udemy.encapsulation.Enc;

public class Enc1 extends Enc{
    void test(){
        Enc enc = new Enc();
        //enc.z;
        //enc.y;
        this.y = 0;
    }
}
