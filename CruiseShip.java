public class CruiseShip extends Ship {

    private int maxPassengers;

    public CruiseShip(String shipName, int shipYear, int maxP) {
        super(shipName, shipYear);
        maxPassengers = maxP;
    }

    public int getMaximumPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString(){
        String str = "Ship Name: " + getShipName() + "\nMaximum Passengers " + maxPassengers;
        return str;
    }
    
}
