import java.util.Scanner;
class sharedres{
    public void pangramcheck(String str){
        String values = "abcdefghijklmnopqrstuvwxyz";

        values = values.replaceAll("[" + str.toLowerCase() +"]","");
        if(values.isEmpty()){
            System.out.printf("pangram");
        }
        else{
            System.err.printf("Not pangram");
        }
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.printf("Interrupted");
        }
    }
}
    class pangram_usingThread{
        public static void main(String[] args) {
            sharedres ob1 = new sharedres();
            Scanner ob = new Scanner(System.in);
            String a = ob.nextLine();
          
            Runnable fun = () ->{
                ob1.pangramcheck(a);
            };
           
            Thread t1 = new Thread(fun);
            t1.start();
            ob.close();
        }
    }
