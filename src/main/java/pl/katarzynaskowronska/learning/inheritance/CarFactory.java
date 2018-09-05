package pl.katarzynaskowronska.learning.inheritance;

public class CarFactory extends Factory {

    private String name;

    public void testDrive(){
        System.out.println("testDrive");
    }

    @Override
    public void checkState(){
        super.checkState();
        System.out.println("checkStateInCarFactory");
    }

    @Override
    public void destroy() {
        System.out.println("car destroy");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CarFactory) {
            if (((CarFactory) obj).getName().equals(this.getName()))//if(((CarFactory) obj).getName().equals(this.getName()))
                return true;
            else
                return false;
            //return super.equals(obj);
        } else
            return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
