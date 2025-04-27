class cylinder{
    private int radius;
    private int height;

    public cylinder (int radius,int height){
        this.radius=radius;
        this.height=height;
    }      

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
        
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
    public double surfaceArea(){
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }

}
public class practice9{
    public static void main(String[] args){
        cylinder mycylinder = new cylinder(6,7);
        
       mycylinder.setHeight(7);
       mycylinder.setRadius(6);
       mycylinder.volume();
       mycylinder.surfaceArea();

        System.out.println(mycylinder.getHeight());
       System.out.println(mycylinder.getRadius());
       System.out.println(mycylinder.volume());
       System.out.println(mycylinder.surfaceArea());
    }
}