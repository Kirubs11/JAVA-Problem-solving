import java.util.*;
class repeat_digit
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int[] ar=new int[10];
        for(int i=0;i<3;i++)
        {
            int digit=ob.nextInt();
            while(digit>0)
            {
                int rem=digit%10;
                ar[rem]+=1;
                digit/=10;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(ar[i]>=3)
            System.out.print(i+" ");
        }

    }
}


// import java.util.*;
// class repeat_digit
// {
//     public static void main(String[] args)
//     {
//         Scanner ob=new Scanner(System.in);
//         int[] ar=new int[10];
//         for(int i=0;i<3;i++)
//         {
//             int digit=ob.nextInt();
//             while(digit>0)
//             {
//                 int rem=digit%10;
//                 ar[rem]+=1;
//                 digit/=10;
//             }
//         }
//         int max=ar[0];
//         for(int i=0;i<10;i++)
//         {
//             if(max<ar[i])
//             {
//                 max=ar[i];
//             }
//         }
//         for(int i=0;i<10;i++)
//         {
//             if(max==ar[i])
//             System.out.print(i+" ");
//         }

//     }
// }