public class RoomDCarpet {

    private RoomDimension dimension;
    private double costPerSqFoot;

    public RoomDCarpet(RoomDimension dimen, double cosPeFo) {

        dimension = dimen;
        costPerSqFoot = cosPeFo;
    }

    public RoomDimension getDimension() {
        return new RoomDimension(dimension);
    }

    public double getCostPerFoot() {
        return costPerSqFoot;
    }

    public double getCost() {
        RoomDimension quick = new RoomDimension(dimension);
        double cost = quick.getArea() * quick.getWidth();
        return cost;
    }
}
