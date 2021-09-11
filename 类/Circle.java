package zuoye;

import java.util.Scanner;

class Circle {
	private double radius;
	public Circle(double radius)
	{this.radius=radius;
	}
	public double getRadius()
	{return this.radius;
	}
	public void setRadius(double radius)
	{this.radius=radius;
	}
	public double getArea()
	{return radius*radius*Math.PI;
	}
	public double getPerimeter()
	{return 2*radius*Math.PI;
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double c=sc.nextDouble();
	Circle s=new Circle(c);
	System.out.println("圆的周长是："+s.getPerimeter());
	System.out.println("圆的面积是："+s.getArea());
}
	
}

