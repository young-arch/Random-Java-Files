public class RoomDimension {
    private int length;
    private int width;

    public RoomDimension(int len, int wid) {

        length = len;
        width = wid;
    }

    public RoomDimension(RoomDimension object2) {
        length = object2.length;
        width = object2.length;
    }

    public void set(int len, int wid) {
        length = len;
        width = wid;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }
}