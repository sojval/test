//problem 1

class Circle{
    int radius;
    

    
     public int getradius(){
        return radius;
     }
     public void setradius(int radius){
            this.radius=radius;
     }
     public double area(int radius){
        return 3.14*radius*radius;
     }

}
class cylinder extends Circle {
    int height;
     

     public int getheight(){
        return height;
     }
     public void setheight(int height){
            this.height=height;
     }
    public double volume(){
        return 3.14*radius*radius*height;
    }
}

public class practice10 {
    public static void main(String[] args){
        
        cylinder c = new cylinder();
        c.setradius(5);
        c.setheight(6);
        c.getradius();
        c.getheight();
        
        System.out.println(c.volume());
        
        
    }
}

//problem 2