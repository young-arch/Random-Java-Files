@FunctionalInterface
interface A{
    int add(int a, int b);
}

public class Quicker{
    public static void main(String arg[]){

        A obj = new A() {
            
            public int add(int a, int b){
                return a + b;
            }
        };
        obj.add(8, 18);
    }
    
}
