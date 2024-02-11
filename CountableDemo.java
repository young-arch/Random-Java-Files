public class CountableDemo {
    public static void main(String[] args) {

        int objectCount;

        Countable object1 = new Countable();
        Countable object2 = new Countable();
        Countable object3 = new Countable();

        objectCount = object2.getInstanceCount();

        System.out.println(objectCount + " instances of the class were created");
    }

}
