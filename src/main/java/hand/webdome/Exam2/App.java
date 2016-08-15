package hand.webdome.Exam2;
//实现工资个人所得税计算

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.print("请输入工资:");
        Scanner scanner = new Scanner(System.in);
         double salary = scanner.nextDouble();
         double salary1 = salary-3500;
         double  cur_salary =0;
         if(salary1<=0)
         {
        	cur_salary = 0;
         }
         else if(salary1<=1500&& salary1>0)
          {
        	cur_salary = salary*0.03;
          }
         else if(salary1<=4500&& salary1>1500)
         {
         	cur_salary = salary*0.1;
         }
         else if(salary1<=9000 && salary1>4500)
         {
       	    cur_salary = salary*0.2;
         }
         else if(salary1<=35000 && salary1>9000)
         {
       	    cur_salary = salary*0.25;
         }
         else if(salary1<=55000 && salary1>35000)
         {
       	    cur_salary = salary*0.3;
         }
         else if(salary1<=80000&& salary1>55000)
         {
       	    cur_salary = salary*0.35;
         }
         else 
         {
           	 cur_salary = salary*0.45;
          }
         System.out.println("所需缴纳的税费为:"+cur_salary);
    }
}
