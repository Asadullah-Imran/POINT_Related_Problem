import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Circle c1= new Circle(-1,0);
        Circle c2= new Circle(15,8);
        Circle c3= new Circle(-5,3);
        Circle c4= new Circle(7,1);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Point to find out is its nearest Circle");
        System.out.print("X= ");
        int x=sc.nextInt();
        System.out.print("Y= ");
        int y= sc.nextInt();
        Point point=new Point(x,y);
        double c1dist=c1.distance(point);
        System.out.println("c1dist= "+c1dist);
        double c2dist=c2.distance(point);
        System.out.println("c2dist= "+c2dist);
        double c3dist=c3.distance(point);
        System.out.println("c3dist= "+c3dist);
        double c4dist=c4.distance(point);
        System.out.println("c4dist= "+c4dist);
        if(c1dist<c2dist&&c1dist<c3dist&&c1dist<c4dist){
            System.out.println("Circle 1 is the nearest point");
        }else if(c2dist<c1dist&&c2dist<c3dist&&c2dist<c4dist){
            System.out.println("Circle 2 is the nearest point");
        }else if(c3dist<c2dist&&c3dist<c1dist&&c3dist<c4dist){
            System.out.println("Circle 3 is the nearest point");
        }else if(c4dist<c2dist&&c4dist<c3dist&&c4dist<c1dist){
            System.out.println("Circle 4 is the nearest point");
        }else{
            System.out.println("there is more than one circle is nearest point");
        }
    }
}

class Circle{
    int x;
    int y;
    Circle(int x,int y){
        this.x=x;
        this.y=y;

    }
    double distance(Point p){
        int x=this.x-p.x;
        int y=this.y-p.y;
         return Math.sqrt(x*x+y*y);
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