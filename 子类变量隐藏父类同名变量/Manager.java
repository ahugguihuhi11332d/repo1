package test;

public class Manager extends Worker {
	private double allowance;
	private double wage;
	public Manager(String name,double wage,double allowance) {
		super (name,wage);
		this.allowance=allowance;
	}
	public void increase() {
		this.wage=this.wage+300;
		this.allowance=this.allowance+200;
	}
	public void print() {
		System.out.println(getName()+"wage:"+wage);
		System.out.println(getName()+"super wage:"+super.getWage());
		System.out.println(getName()+"allowance:"+allowance);
	}

	public static void main(String args[]) {
		Worker w1=new Worker("张三",2000);
		w1.increase();
		w1.print();
		Manager w2=new Manager("李四",2000,500);
		w2.increase();
		w2.print();
		Worker w3=new Manager("王五",2000,500);
		w3.increase();
		System.out.println("w3.wage="+w3.getWage());
		

	}

}

