public class InstanceCount {
    private static int counting = 0;

    public InstanceCount() {

        counting++;
    }

    public int getInstanceCount() {
        return counting;
    
    }

}