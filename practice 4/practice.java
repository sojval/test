
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
 /*   System.out.print("What is your income?:");
    int income = sc.nextInt();

    if(income<250000){

        System.out.println("NO TAXES!");
    }
    else if(250000<=income && income<=500000){
        System.out.println("The tax charges will be 5% ");
        float x = income/20.0f;
        System.out.print("Total payable tax will be: ");
        System.out.print(x);
    }
    else if(500000<income && income<1000000){
        System.out.println("The tax charges will be 20% ");
        float y = income/5.0f;
        System.out.print("Total payable tax will be: ");
        System.out.print(y);
    }
    else if (income>1000000){
        System.out.println("The tax charges will be 30% ");
        float z = income/0.3f;
        System.out.print("Total payable tax will be: ");
        System.out.print(z);
    }
    }
} */
  
   //question5

  /* System.out.print("Enter a year :");
   float year = sc.nextInt();
   float leap_year = year%4;
   if (leap_year==0){
     System.out.print("this is leap year");
   }
   else{
     System.out.print("Not a leap year");
   }
    }
}
*/

 //question4
/*
 System.out.print("Enter a number for a day:");
 int day = sc.nextInt();

 switch(day){
    case 1 :
     System.out.print("Monday");
     break;
     case 2 :
     System.out.print("Tuesday");
     break;
     case 3 :
     System.out.print("Wednesday");
     break;
     case 4:
     System.out.print("Thursday");
     break;
     case 5 :
     System.out.print("Friday");
     break;
     case 6 :
     System.out.print("Saturday");
     break;
     case 7 :;
     System.out.print("Sunday");
     break;
     default:
        System.out.print("Invakid day");

 }
    }
}
*/
 //question6

 System.out.print("Enter a string:");
 String website = sc.next();

 if(website.endsWith(".com")){
    System.out.print("Commercial website");
 }
 else if (website.endsWith(".org")){
    System.out.print("Organisation website");
 }
 else if (website.endsWith(".in")){
    System.out.print("Indian website");
 }
    }
}