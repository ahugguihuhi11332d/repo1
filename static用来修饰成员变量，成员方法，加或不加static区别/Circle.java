package test;

public class Circle {
	public static int numOfCircle=0;
	private double radius;
	public  Circle(double radius) {
		this.radius=radius;
		numOfCircle++;
	}
	public static void main(String[] args) {
		System.out.println("Circle.numOfCircle="+Circle.numOfCircle);
		Circle c1=new Circle(2);
		System.out.println("Circle.numOfCircle="+Circle.numOfCircle);
		c1.radius=c1.radius+1;
		System.out.println("c1.radius="+c1.radius);
		Circle c2=new Circle(10);
		System.out.println("Circle.numOfCircle="+Circle.numOfCircle);
		c2.radius=c2.radius+1;
		System.out.println("c2.radius="+c2.radius);
		System.out.println("c1.numOfCircle="+c1.numOfCircle);
		System.out.println("c2.numOfCircle="+c2.numOfCircle);
/**类变量(有static)，保存在类的内存里，第一次加载类的时候，就开辟了类的内存，
类变量就存在了，直到程序运行结束。访问方法有两种："对象名.变量名"或者"类名.变量名"

实例变量(没有static)，位于对象的内存空间中，只有创立了对象后，实例变量才存在，
随着对象的创建而存在，随着对象的消亡而消亡。访问只能通过"对象名.变量名"*/
	}

}
