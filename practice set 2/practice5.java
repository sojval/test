import java.util.Scanner;

public class practice5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //question1
       /* for(int i=4;i>0;i--){
             for(int j=0;j<i;j++){
                System.out.print("*");
             }
            System.out.print("\n");
        }
    }
} */

  //question2
 /* System.out.print("Enter a number:");
  int a = sc.nextInt();
  int sum= 0;
  for(int i =1;i<=a;i++){
    int b= 2*i;
    sum =sum +b;
   
  }
  System.out.println("The sum of even natural numbr :");
  System.out.println(sum);
  
    }
} */

//question3
/*System.out.print("Enter a number:");
int num = sc.nextInt();
System.out.print("The table of number is");
for(int i = 1;i<=10;i++){
    int a = num*i;
    System.out.println(a);
}

    }
} */

//question4

/*System.out.print("Enter a number:");
int num = sc.nextInt();
System.out.println("The table of number is");
for(int i = 10;i>0;i--){
    int a = num*i;
    System.out.println(a);
}

    }
}*/

//question5
System.out.print("Enter a number:");
int num = sc.nextInt();
int factorial =0;
System.out.println("The factorial of given number is");
for(int i=1;i<=num;i++){
   factorial= factorial*i;
   factorial*=i;
    System.out.print(factorial);
}
    }
}