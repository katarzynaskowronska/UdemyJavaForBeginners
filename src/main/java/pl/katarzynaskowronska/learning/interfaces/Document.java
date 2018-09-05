package pl.katarzynaskowronska.learning.interfaces;

public interface Document {
    //szkielet co mamy robic a nie jak mamy robic
    public String d = "d";
    public boolean save();
    public String open(String path);
    // tylko jak jest default mozna wpisac cialo metody ale nie mozna pozniej tej metody adpisywac
    public default void write(){
        System.out.println("write sth");
    }
}
