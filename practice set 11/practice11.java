//problem 1 and 2 

// abstract class Pen {
//     abstract void write();
//     abstract void refill();
// }
// class fountainPen extends Pen{
//     void changeNib(){
//         System.out.println("changinf the nib ");
//     } 
//     void write(){
//            System.out.println("changinf the nib ");
//     } 
    
//     void refill(){
//          System.out.println("changinf the nib ");
//     } 
//     }
// public class practice11{
//     public static void main(String[] args){
//         fountainPen pen = new fountainPen();
//         pen.changeNib();
//         pen.write();
//         pen.refill();
//     }
// }

//problem3

// class monkey{
//      public void jump(int a){
//         System.out.println("jumping....");
//     }
//     public  void bite(){
//         System.out.println("biting....");
//     }
// }
// interface  basicAnimal{
//     public void eat();
//     public void sleep();
// }
// class human extends monkey implements basicAnimal{
//     public void jump(){
//         System.out.println("jumping");
//     }
//     public void bite(){
//         System.out.println("biting");
//     }
//     public void eat(){
//         System.out.println("eating");
//     }
//     public void sleep(){
//         System.out.println("sleeping");
//     }
// }
// public class practice11{
//    public static void main(String[] args){
//       human man = new human();
//       man.jump(5);
//       man.sleep();
//       man.eat();
//       man.bite();
//    }
// }

//problem 4
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


public class practice11 {
    public static void main(String[] args){
        thread t = new thread();
        t.getPriority();
        thread2 tt = new thread2();
        t.start();
        tt.start();
    }
}
