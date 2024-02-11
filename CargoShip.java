public class CargoShip extends Ship {
    private int cargoCapa;

    public CargoShip(int cCapa, String shipName, int shipYear) {
        super(shipName, shipYear);
        cargoCapa = cCapa;
    }

    public int getCargoCapa() {
        return cargoCapa;
    }

    @Override
    public String toString() {
        String str = "Ship Name: " + getShipName() + "Ship Capacity: " + cargoCapa;
        return str;
    }

}
