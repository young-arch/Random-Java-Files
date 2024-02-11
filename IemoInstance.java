public class IemoInstance {
    public static void main(String[] args) {

        int numOfInstanceCreated;

        InstanceCount object1 = new InstanceCount();
        InstanceCount object2 = new InstanceCount();
        InstanceCount object3 = new InstanceCount();
        InstanceCount object4 = new InstanceCount();

        numOfInstanceCreated = object3.getInstanceCount();

        System.out.println("The number of instances created were " + numOfInstanceCreated);

    }

}
