//problem1

/*  class employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
  }

  public class practice81{
    public static void main(String[] args){
        employee Sojval = new employee();
        Sojval.setName("Sojval Paropate");
        Sojval.salary= 344;
        System.out.println(Sojval.getSalary());
        System.out.print(Sojval.getName());
        
    }
  }

*/
//problem 2
/*
class cellphone{
    public void ringing(){
        System.out.println("ringing....");
    }
    public void vibrating(){
       System.out.print("vibrating...."); 
    }
}
public class practice8 {
    public static void main(String[] args){
      cellphone asus = new cellphone();
      asus.ringing();
      asus.vibrating();  
    }
}
*/

//problem 3
/*
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class practice8{
    public static void main(String[] args){
        square sc = new square();
        sc.side = 5;
        sc.area();
        sc.perimeter();
        System.out.println(sc.area());
        System.out.print(sc.perimeter());
    }
}
*/
//problem 4
/*
class rectangle{
    int side1;
    int side2;
    public int area(){
        return side1*side2;
    }
    public int perimeter(){
        return 2*side1+2*side2;
    }
}

public class practice8{
    public static void main(String[] args){
        rectangle sc = new rectangle();
        sc.side1 = 5;
        sc.side2=6;  
        System.out.println(sc.area());
        System.out.print(sc.perimeter());
    }
}
*/
//proble
class thread extends Thread{
    public void meth1(){
        System.out.println("hello");
    }
}
class thread2 extends Thread{
    public void meth2(){
        System.out.println("haa");
    }
}


public class practice8 {
    public static void main(String[] args){
        thread t = new thread();
        t.setPriority(5);
        thread2 tt = new thread2();
        t.start();
        tt.start();
    }
}
