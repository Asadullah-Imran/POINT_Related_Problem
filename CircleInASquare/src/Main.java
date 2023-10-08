import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("There is a given square shape co-ordinates respectiveliy (2,3),(7,3),(7,8),(2,8)");
        System.out.println("To check your given circle is fit in the square shape or not");
        System.out.println("Enter a circle Center point ");
        System.out.print("X= ");
        int x=sc.nextInt();
        System.out.print("Y= ");
        int y=sc.nextInt();
        System.out.println("Radius of the circle");
        System.out.print("R= ");
        int r=sc.nextInt();

        Point point=new Point(x,y);

        Point sqrpoint1 = new Point(2,3);
        Point sqrpoint2 = new Point(7,3);
        double sqrlength= sqrpoint1.distance(sqrpoint2);

        Point highsqrpoint= new Point( (sqrpoint1.x+(int)sqrlength),sqrpoint1.y+(int)(sqrlength));


        if(point.calculation(sqrpoint1,highsqrpoint,r)){
            System.out.println("Circle will fit in the Square box");
        }else{
            System.out.println("Circle will not fit in the Square box");
        }


    }



}
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x  =x;
        this.y=y;
    }
    double distance(Point p){
        int x=this.x- p.x;
        int y=this.y-p.y;
        return Math.sqrt(x*x+y*y);
    }
    boolean calculation(Point lower, Point higher,int r){
        int x1=this.x- lower.x;
        int x2= higher.x-this.x;
        int y1= this.y- lower.y;
        int y2= higher.y-this.y;
        int x=min(x1,x2);
        int y=min(y1,y2);
        int z=min(x,y);
        if(z>=r){
            return true;
        }else{
            return false;
        }

    }
}