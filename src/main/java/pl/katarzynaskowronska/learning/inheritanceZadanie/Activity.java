package pl.katarzynaskowronska.learning.inheritanceZadanie;

public abstract class Activity {

    public abstract void onCreate();

    public boolean onPause(int i){
        if (i == 0){
            boolean b = true;
            return b;
        }
        else
            return false;
    }

    public boolean onStop(int i){
        if (i == 0){
            boolean b = true;
            return b;
        }
        else
            return false;
    }
}
