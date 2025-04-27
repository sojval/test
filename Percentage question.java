
import java.util.Scanner;

public class third {
    public static void main(String[] args)
    {
    System.out.println("Taking input from user");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number 1");
    int a = sc.nextInt();
    System.out.println("Enter a number 2");
    int b = sc.nextInt();
    System.out.println("Enter a number 3");
    int c = sc.nextInt();
    System.out.println("Enter a number 4");
    int d = sc.nextInt();

    int sum = a+b+c+d;
    System.out.println("The sum is :");
    System.out.println(sum);
    float total = 400;
    float percentage = (sum/total)*100;
    System.out.println("The percentage is:");
    System.out.println(percentage);
    sc.close();
    }
}