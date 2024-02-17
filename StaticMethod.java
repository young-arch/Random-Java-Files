class MobileBrands{

    String brandName;
    int price;
    static String typemachine;

    public void showInfo(){
        System.out.println(brandName + ": " +  price);
    }

    public static void getTypemachine(MobileBrands get){
        System.out.println(get.brandName + ": " + typemachine);
    }
}

public class StaticMethod{

    public static void main(String args[]){

        MobileBrands mob = new MobileBrands();
        MobileBrands mob2 = new MobileBrands();
        MobileBrands mob3 = new MobileBrands();

        mob.brandName = "Samsung";
        mob.price = 120-000;
        MobileBrands.typemachine = "SmartPhone";

        mob2.brandName = "Iphone";
        mob2.price = 80-000;

        mob3.brandName = "Huawei";
        mob3.price = 89-000;

        mob.showInfo();

        MobileBrands.getTypemachine(mob);

    }
    
}
