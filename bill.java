import java.util.*;
class Bill
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter consumer name");
        String n=sc.nextLine();
        System.out.println("enter total unit u have cosumed :");
        float unit=sc.nextFloat();
        if(unit>150)
        {
            float a=unit-150;
            float x=(a*7)+550;
            System.out.println("you bill amount is :"+x);
        }
        else if(150<unit && unit>50)
        {
            float b=unit-50;
            float y=(b*4)+150;
            System.out.println("your bill amount is:"+y);
        }
        else
        {
            float c=unit*3;
            System.out.println("your bill amount is:"+c);
        }       
    }
}

