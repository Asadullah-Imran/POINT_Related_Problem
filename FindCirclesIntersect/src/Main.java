import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        double r1;
        double r2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first Circle co-ordinator");
        System.out.print("X1= ");
        x1=sc.nextInt();
        System.out.print("Y1= ");
        y1=sc.nextInt();
        System.out.print("radius r1= ");
        r1=sc.nextDouble();
        System.out.println("Enter Second Circle co-ordinator");
        System.out.print("X2= ");
        x2=sc.nextInt();
        System.out.print("Y2= ");
        y2=sc.nextInt();
        System.out.print("radius r2= ");
        r2=sc.nextDouble();

        Point p1= new Point(x1,y1);
        Point p2= new Point(x2,y2);

    double dist=p1.distance(p2);
    double radius=r1+r2;
    if(checkIntersection(dist,radius)){
        System.out.println("It dose not intersect");
    }else{
        System.out.println("it intersect");
    }
    }

    static boolean checkIntersection(double distance,double radius){
        if(distance>=radius){
            return true;
        }else{
            return false;
        }
    }
}

class Point{
    int x;
    int y;
    public Point(int a,int b){
        this.x=a;
        this.y=b;
    }

    public double distance(Point scndP){
        int x= this.x- scndP.x;
        int y= this.y- scndP.y;
        return Math.sqrt(x*x+y*y);
    }
}