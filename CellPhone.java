public class CellPhone {
    private String manufact;
    private String model;
    private double retailPrice;

    public CellPhone(String man, String mod, double price) {
        manufact = man;
        model = mod;
        price = retailPrice;

    }

    public void setManufact(String man) {
        manufact = man;
    }

    public void setMod(String mod) {
        model = mod;
    }

    public void setRetailPrice(double price) {
        retailPrice = price;
    }

    public String getManufact() {
        return manufact;
    }

    public String getModel() {
        return model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

}
