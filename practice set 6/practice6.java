import java.util.Scanner;

public class practice6{
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
      //problem1
       /*
      float [] floats = {56.1f,65.6f,87.0f,100.0f,99.9f};
       float sum =0;
        for(int i =0;i<floats.length;i++){
              float a =floats[i];
              sum = sum + a;
        }
        System.out.print(sum);
       */

      //problem2
      /*
         System.out.print("Enter a integer:");
         int a = sc.nextInt();
         int [] marks = {56,65,87,100,99};
         for(int i=0;i<marks.length;i++){
         if(a== marks[i]){
            System.out.print("Integer is present");
         }
         
         }
         System.out.print("Integer is  not present");

         */
          
          //problem3

       /*   float [] floats = {56.1f,65.6f,87.0f,100.0f,99.9f};
          int b = floats.length;
       float sum =0;
        for(int i =0;i<floats.length;i++){
              float a =floats[i];
              sum = sum + a;
        }
        System.out.print(sum/b);
        */

        //problem4

        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,6,13},
                         {3,7,1}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

       for(int i =0 ;i<mat1.length;i++){
        for(int j = 0;j<mat1[i].length;j++){
            result[i][j]= mat1[i][j]+mat2[i][j];
            System.out.print(result[i][j] + " ");
        }

       }                    
        

    }   
}   