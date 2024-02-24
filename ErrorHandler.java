public class ErrorHandler{
    public static void main(String[] args){

        int num[] = new int[5];

        try{
            int b;
            b = num[5];
            
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong " + e);
        }

        System.out.println("It works");

        
    }
    
}
