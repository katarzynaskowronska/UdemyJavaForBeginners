package pl.katarzynaskowronska.learning.inheritance;

public abstract class Factory {

    public void produce(){
        System.out.println("produce");
    }

    public void checkState(){
        System.out.println("checkState");
    }

    public abstract void destroy();

    public String introduceYourself(){
        return "Factory";
    }
}
