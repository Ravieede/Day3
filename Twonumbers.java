
import java.util.Scanner;
class Greater
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("To Check  the number is greater or not:");
        System.out.print("Enter the number1:");
        int num1=x.nextInt();
         System.out.print("Enter the number2:");
        int num2=x.nextInt();
        if(num1>num2)
          {
              int last_digit=num1%10;
               int last_digit2=num2%10;
              System.out.print(last_digit+" is the last digit of "+ num1+"\n"+last_digit2+" is the last digit of" +  " " +num2);
             
          }
          
          else 
          {
              int sum=num1+num2;
              System.out.println(sum+" is the sum of two number.");
          }
    }
}