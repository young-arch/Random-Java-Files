class QuincyDavincy{

    public int divisi(int a, int b){

        return a/b;
    }
}

public class MethodOverload {

    public static void main(String args[]){

        int a = 8;
        int b = 9;
        int c = 7;

       double summ = add(a,b,c);
       System.out.println(summ);

       int sum = add(a,b,c);
       System.out.println(sum);
       
       int get = add(a, b);
       System.out.println(get);

       QuincyDavincy out = new QuincyDavincy();

       int num = out.divisi(a, b);
       System.out.println(num);


    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(int a, int b, double c){
        return a+b+c;
    }
    
}
