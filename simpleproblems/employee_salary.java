/* 20000 : HRA = 30%, DA=95%"}'>Given basic Salary of an employee,calculate its gross salary according to the following condition:

Basic Salary <= 10000 : HRA = 20%, DA=80%

Basic Salary <= 20000 : HRA = 25%, DA=90%

Basic Salary > 20000 : HRA = 30%, DA=95%  */

import java.util.*;
class employee_salary{
  public static void main(String[]args)
  {
    double hra,ha;
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    if(a<=10000)
    {
      hra=0.2*a;
      ha=0.8*a;
    }
    else if(a<=20000)
    {
      hra=0.25*a;
      ha=0.9*a;
    }
    else{
      hra=0.3*a;
      ha=0.95*a;
    }
    double b=a+hra+ha;
    System.out.printf("Rs.%.2f",b);
  }
}