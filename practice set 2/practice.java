pac
import java.util.Scanner;
import java.util.*;

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     /*   //question2 
        float total = 300;
        System.out.print("Enter a marks of subject 1 :");
        int a =  sc.nextInt();
        System.out.print("Enter a marks of subject 2 :");
        int b =  sc.nextInt();
        System.out.print("Enter a marks of subject 3 :");
        int c =  sc.nextInt();
       float sum = a+ b +  c;
       float average =  sum/300;
    
        double percentage =  average*100;
        System.out.print("The percentage of a student is :");
        System.out.println(percentage);
         if(percentage>35.0){
            System.out.println("congratulations you have cracked the exam!");

         }
         else
        {
            System.out.print("Better luck next time!");
        }
    }
}*/


  //question3
    System.out.print("What is your income?:");
    int income = sc.nextInt();

    if(income<250000){

        System.out.println("NO TAXES!");
    }
    else if(250000<=income<=500000){
        System.out.print("The tax charges will be 5% ");
        float x = income/20.0f;
        System.out.print("Total payable tax will be: ");
        System.out.print(x);
    }
    else if(500000<income<1000000){
        System.out.print("The tax charges will be 20% ");
        float y = income/5.0f;
        System.out.print("Total payable tax will be: ");
        System.out.print(y);
    }
    else if (income>1000000){
        System.out.print("The tax charges will be 30% ");
        float z = income/0.3f;
        System.out.print("Total payable tax will be: ");
        System.out.print(z);
    }
    }
}