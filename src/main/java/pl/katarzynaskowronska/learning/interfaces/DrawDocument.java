package pl.katarzynaskowronska.learning.interfaces;

public class DrawDocument implements Document {
    @Override
    public boolean save() {
        System.out.println("Save Draw Doc.");
        return false;
    }

    @Override
    public String open(String path) {
        return "draw file: " + path;
    }

    public void draw(OnClickListener ocl){
        System.out.println("draw...");
    }
}
