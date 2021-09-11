package zuoye;

import java.util.Scanner;

public class Student{ 
	private int xh,code,age;
	private String name,sex;
	public Student(int xh,int code,String name,String sex,int age){
		super();
		this.xh=xh;
		this.code=code;
		this.name=name;
		this.sex=sex;
		this.age=age;
		}
	public int GetXh(){
		return xh;
		}
	public int GetCode(){
		return code;
		}
	public String GetName(){
		return name;
		}
	public String GetSex(){
		return sex;}
	public int age(){
		return age;}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int xh=sc.nextInt();
		int code=sc.nextInt();
		String name=sc.nextLine();
		String sex=sc.nextLine();
		int age=sc.nextInt();
		sc.close();
		Student a=new Student(xh,code,name,sex,age);
		System.out.println("学号是:"+a.GetXh());
		System.out.println("班号是:"+a.GetCode());
		System.out.println("姓名是:"+a.GetName());
		System.out.println("性别是:"+a.GetSex());
		System.out.println("年龄是:"+a.age());
		}
			}
