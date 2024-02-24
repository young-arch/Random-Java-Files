class A{
    public void show(){
        System.out.println("show in A");
    }
}

class B extends A{

}

class C extends B{

    public void show(){
        System.out.println("Show in C");
    }
}

public class DynamicMethodDispatch{
    public static void main(String args[]){

        A get = new A();
        System.out.println(A);

        get = new A();
        get = new B();
        

    }
    
}
