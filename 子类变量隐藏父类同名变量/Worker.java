package test;

public class Worker {
	private String name;
	private double wage;
	public Worker(String name, double wage) {
		this.name=name;
		this.wage=wage;
	}
	public void increase() {this.wage=this.wage+100;}
	public void print() {System.out.println(name+"wage:"+wage);}
	

}

