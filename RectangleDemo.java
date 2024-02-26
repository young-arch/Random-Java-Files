public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(30, 40);

        box.setLength(30);
        box.setWidth(40);

        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());

        System.out.println("The box's area is " + box.getArea());

    }

}
