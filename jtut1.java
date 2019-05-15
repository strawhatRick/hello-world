class thing{
    public final static int LUCKY_NUMBER = 8;
    
    public String name;
    public static String description;

    public static int count;

    public int id;

    public thing(){
        id = count;
        count++;
    }

    public void showName(){
        //System.out.println(name);
        System.out.println("object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo(){
        System.out.println(description);
        //WON'T WORK  System.out.println(name);
    }
}

public class jtut1{
    public static void main(String[] args) {
        thing.description = "I am a String";
        thing.showInfo();
        System.out.println("before creating objects count is: " + thing.count);

        thing t1 = new thing();
        thing t2 = new thing();

        System.out.println("after creating objects count is: " + thing.count);

        t1.name = "Bob";
        t2.name = "Rob";

        t1.showName();
        t2.showName();

        System.out.println(thing.LUCKY_NUMBER);
    }
}