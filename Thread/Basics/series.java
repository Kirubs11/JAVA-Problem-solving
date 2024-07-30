import java.util.Scanner;
class series implements Runnable 
{
  int limit;
  public series(int limit)
  {
    this.limit = limit;
  }
  public void run()
  {
    for (int i = 1; i <= limit; i++)
    {
      int pr;
      if (i % 2 == 0)
      {
        pr = (int) (Math.pow(i, 2) - 2);
      }
      else 
      {
        pr = (int) (Math.pow(i, 2) - 1);
      }
      System.out.print(pr + " ");
      step(1100);
    }
  }
   public static void step(int milliseconds)
   {
    try
    {
      Thread.sleep(milliseconds);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the range of numbers: ");
    int n = ob.nextInt();
    series s = new series(n);
    Thread t1 = new Thread(s);
    t1.start();
    try
    {
      t1.join();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}