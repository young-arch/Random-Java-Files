public class ErrorHandlingExcep{
    public static void main(String args[]){

        int i = 0;
        int j = 0;

        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("There was a problem");
        }

        System.out.println("Hello World");
        System.out.println(j);
    }
    
}
