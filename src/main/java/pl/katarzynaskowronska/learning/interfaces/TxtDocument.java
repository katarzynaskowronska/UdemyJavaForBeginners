package pl.katarzynaskowronska.learning.interfaces;

import java.io.Serializable;

public class TxtDocument extends AbstractDocument implements Document, Serializable {
    @Override
    public boolean save() {
        String s = d;
        //d = "";
        System.out.println("Save Txt Doc.");
        return false;
    }

    @Override
    public String open(String path) {
        return "txt file: " + path;
    }
}
