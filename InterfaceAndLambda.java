
interface A{
    void show();
}

class B implements A{
    public int addNums(int a, int b){

        return a + b;
    }

    @Override
    public void show() {
        System.out.println("This is it ");
    }

}

public class InterfaceAndLambda{
    public static void main(String args[]){

        B obj = new B();

        obj.show();

        }

    
    
}
