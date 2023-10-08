import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    Circle c1= new Circle(-1,0,3);
    Circle c2= new Circle(15,8,9);
    Circle c3= new Circle(-5,3,3);
    Circle c4= new Circle(7,1,1);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Point to find out is its position in the circle or out of the circle: ");
        System.out.print("X= ");
        int x=sc.nextInt();
        System.out.print("Y= ");
        int y= sc.nextInt();
        Point point=new Point(x,y);
        if(c1.eligible(point)){
            System.out.println("This Point is inside the Circle");
            System.out.println("c1");
        }else if(c2.eligible(point)){
            System.out.println("This Point is inside the Circle");
            System.out.println("c2");
        } else if(c3.eligible(point)){
            System.out.println("This Point is inside the Circle");
            System.out.println("c3");
        } else if(c4.eligible(point)){
            System.out.println("This Point is inside the Circle");
            System.out.println("c4");
        } else{
            System.out.println("it is not inside the box");
        }

    }
}

class Circle{
    int x;
    int y;
    double r;
    Circle(int x,int y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
    boolean eligible(Point p){
        int x=this.x-p.x;
        int y=this.y-p.y;
        double distance= Math.sqrt(x*x+y*y);
        if(distance<this.r){
            return true;
        }
        else{return false;}
    }
}
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}