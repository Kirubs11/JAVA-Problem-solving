class multiplethread{
    int count=0;
    public synchronized void increase(String name)
    {
        count++;
        System.out.println(name+ " increased to " + count);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " interrupted ");
        }
    }
}
public class thread1 {
    public static void main(String[] args)
    {
        multiplethread obj=new multiplethread();
        Runnable test1=() ->
        {
            for(int i=0;i<5;i++){
                obj.increase("thread 1");
            }
        };
        Runnable test2=() ->
        {
            for(int i=0;i<5;i++){
                obj.increase("thread 2");
            }
        };
        Thread t1=new Thread(test1);
        Thread t2=new Thread(test2);
        t1.start();
        t2.start();
    }    
}
