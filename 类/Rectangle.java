package zuoye;
import java.util.Scanner;
public class Rectangle {
	double  x,y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x=x;
	}
	public double getY() {
	return y;
	}
	public void setY(double y) {
		this.y=y;
	}
	public double getArea() {return x*y;}
	public double getPerimeter() {return 2*(x+y);}
	public Rectangle(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		sc.close();
		Rectangle r1=new Rectangle(x,y);
		System.out.println("r1的面积是："+r1.getArea());
		System.out.println("r1的周长是："+r1.getPerimeter());
	}

}
