import java.util.Scanner;

 /*public class practice7 {
    static void table(int a){
        for(int i = 1 ; i<=10;i++){
            int z = a*i;
            System.out.println(a + "X" + i + "=" + z );
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = sc.nextInt();

        System.out.print("The multiplication table:");
        table(a);
        
    }
}*/

//problem2
/*public class practice7{
    static void pattern(int n){
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        pattern(n);


    }

}  */

//problem4
/*public class practice7{
    static void pattern(int n){
        for(int i = 0;i<=n;i++){
            for(int j =i+1;j>0;j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        pattern(n);


    }

}*/

//problem5
public class practice7{
     int sum = 0;
    static int sum(int n){
       if(n == 1){
        return 1;
       } 
       return n+sum(n-1);     
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a number:");
        int n = sc.nextInt();
         int result =sum(n);
        System.out.print("The sum is :");
        System.out.print(result);

    }

}

